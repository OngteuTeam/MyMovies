package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.model.Film;
import android.content.ContentValues;

public class FilmORM {
	
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

	public static long add() {
		long result = -1;

		return result;
	}

	public static long update() {
		long result = -1;

		return result;
	}

	public static long delete() {
		long result = -1;

		return result;
	}

	private static ContentValues convertToContentValues(Film film){
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
	
	public static Film getFilmById(){
		Film f = new Film();
		
		return f;
	}
		
	public static ArrayList<Film> getList() {
		ArrayList<Film> list = new ArrayList<Film>();

		return list;
	}

	public static ArrayList<Film> getListByCategoryId() {
		ArrayList<Film> list = new ArrayList<Film>();

		return list;
	}
	
	public static ArrayList<Film> getSearch() {
		ArrayList<Film> list = new ArrayList<Film>();

		return list;
	}
	
	
}
