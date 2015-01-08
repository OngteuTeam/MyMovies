package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.model.Category;
import aiti.m1403l.group1.data.model.Film;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class FilmCategoryORM {

	public static final String TABLE_NAME = "FilmCategory";

	public static final String COL_FILM_ID = "film_id";
	public static final String COL_CATEGORY_ID = "category_id";
	private static SQLiteDatabase mDB;

	/*
	 * SQL CREATE TABLE
	 */
	public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
			+ " (" + COL_FILM_ID + " INTEGER, " + COL_CATEGORY_ID
			+ " INTEGER);";
	/*
	 * SQL DROP TABLE
	 */
	public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;

	/*
	 * @Decription: Function for Film
	 */

	public static long add(int filmId, int categoryId) {
		long result = -1;
		FilmCategoryORM categoryORM = new FilmCategoryORM();
		try {
			ContentValues values = new ContentValues();
			values.put(COL_FILM_ID, filmId);
			values.put(COL_CATEGORY_ID, categoryId);

			result = mDB.insert(TABLE_NAME, null, values);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static long deleteByFilmId(int filmId) {
		long result = -1;
		mDB.delete(TABLE_NAME, COL_FILM_ID + "=" + filmId, null);
		return result;
	}

	public static ArrayList<Category> getListCategoryByFilmId(int filmId) {
		ArrayList<Category> list = null;

		return list;
	}

}
