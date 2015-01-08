package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.DatabaseWrapper;
import aiti.m1403l.group1.data.model.Film;
import android.R.id;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class FilmORM {
	static ContentValues values = new ContentValues();
	static Film film = new Film();
	public static final String TABLE_NAME = "Film";

	public static final String COL_ID = "id";
	public static final String COL_NAME = "name";
	public static final String COL_YEAR = "year";
	public static final String COL_IMAGE = "image";
	public static final String COL_YOUTUBEID = "youtube_id";
	public static final String COL_VIEW = "view_count";
	public static final String COL_LIKE = "like";
	public static final String COL_DURATION = "duration";

	/*
	 * SQL CREATE TABLE
	 */
	public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
			+ " (" + COL_ID + " INTEGER PRIMARY KEY, " + COL_NAME + " TEXT, "
			+ COL_YEAR + " INTEGER, " + COL_IMAGE + " TEXT, " + COL_YOUTUBEID
			+ " TEXT, " + COL_VIEW + " INTEGER, " + COL_LIKE + " INTEGER, "
			+ COL_DURATION + " TEXT);";
	/*
	 * SQL DROP TABLE
	 */
	public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;

	/*
	 * @Decription: Function for Film
	 */

	public static long add(Context context) {
		long result = -1;
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();

		try {
			convertToContentValues(film);
			result = mDB.insert(TABLE_NAME, null, values);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public static long update(Context context, int id) {
		long result = -1;
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		convertToContentValues(film);
		result = mDB.update(TABLE_NAME, null, COL_ID + "=" + id, null);
		return result;
	}

	public static long delete(Context context, int id) {
		long result = -1;
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		mDB.delete(TABLE_NAME, COL_ID + "=" + id, null);
		return result;
	}

	private static ContentValues convertToContentValues(Film film) {
		ContentValues values = new ContentValues();
		values.put(FilmORM.COL_ID, film.getId());
		values.put(FilmORM.COL_NAME, film.getName());
		values.put(FilmORM.COL_YEAR, film.getYear());
		values.put(FilmORM.COL_IMAGE, film.getImage());
		values.put(FilmORM.COL_YOUTUBEID, film.getYoutubeId());
		values.put(FilmORM.COL_VIEW, film.getViewCount());
		values.put(FilmORM.COL_LIKE, film.getLike());
		values.put(FilmORM.COL_DURATION, film.getDuration());
		return values;
	}

	private static Film convertToFilm(Cursor c) {
		Film f = new Film();
		f.setId(c.getInt(c.getColumnIndex(COL_ID)));
		f.setName(c.getString(c.getColumnIndex(COL_NAME)));
		f.setYear(c.getInt(c.getColumnIndex(COL_YEAR)));
		f.setImage(c.getString(c.getColumnIndex(COL_IMAGE)));
		f.setYoutubeId(c.getString(c.getColumnIndex(COL_YOUTUBEID)));
		f.setViewCount(c.getInt(c.getColumnIndex(COL_VIEW)));
		f.setLike(c.getInt(c.getColumnIndex(COL_LIKE)));
		f.setDuration(c.getString(c.getColumnIndex(COL_DURATION)));
		return f;
	}

	public static Film getFilmById(Context context, int id) {

		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + COL_ID
				+ " = '" + id + "'";
		Cursor c = mDB.rawQuery(sql, null);
		if (c != null) {
			c.moveToFirst();
		}
		convertToFilm(c);

		return film;
	}

	public static ArrayList<Film> getList(Context context) {
		ArrayList<Film> list = new ArrayList<Film>();
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		Cursor c = null;
		c = mDB.query(TABLE_NAME, null, null, null, null, null, null);
		if (c.moveToFirst()) {
			do {

				convertToFilm(c);
				list.add(film);
			} while (c.moveToNext());
		}

		return list;
	}

	public static ArrayList<Film> getListByCategoryId(Context context,
			int categoryId) {
		ArrayList<Film> list = new ArrayList<Film>();
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		Cursor c = null;
		String sql = "SELECT * FROM " + TABLE_NAME + " WHERE "
				+ CategoryORM.COL_ID + " = '" + categoryId + "'";
		c = mDB.rawQuery(sql, null);
		if (c.moveToFirst()) {
			do {
				convertToFilm(c);
				list.add(film);
			} while (c.moveToNext());
		}

		return list;
	}

	public static ArrayList<Film> getSearch(Context context, String filter) {
		ArrayList<Film> list = new ArrayList<Film>();
		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		Cursor c = null;
		String sql = " SELECT * FROM " + TABLE_NAME + " WHERE " + COL_NAME
				+ " LIKE '%" + filter + "%'";
		c = mDB.rawQuery(sql, null);

		while (c.isAfterLast() == false) {
			convertToFilm(c);
			list.add(film);
		}

		return list;
	}

}
