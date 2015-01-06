package aiti.m1403l.group1.data.table;

public class TbFilm {
	
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
}
