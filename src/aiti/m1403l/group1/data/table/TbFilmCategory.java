package aiti.m1403l.group1.data.table;

public class TbFilmCategory {
	
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
	
}
