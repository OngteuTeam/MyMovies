package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.model.Category;
import aiti.m1403l.group1.data.model.Film;

public class FilmCategoryORM {
	
	public static final String TABLE_NAME = "FilmCategory";

	public static final String COL_FILM_ID = "film_id";
	public static final String COL_CATEGORY_ID = "category_id";

	/*
	 * SQL CREATE TABLE
	 */
	public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
			+ " (" + COL_FILM_ID + " INTEGER, " + COL_CATEGORY_ID + " INTEGER);";
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

		return result;
	}

	public static long deleteByFilmId(int filmId) {
		long result = -1;

		return result;
	}

	public static ArrayList<Category> getListCategoryByFilmId(int filmId) {
		ArrayList<Category> list = null;

		return list;
	}
	
	
	
}
