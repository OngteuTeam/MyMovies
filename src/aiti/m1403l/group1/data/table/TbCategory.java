package aiti.m1403l.group1.data.table;

public class TbCategory {

	public static final String TABLE_NAME = "Category";

	public static final String COL_ID = "id";
	public static final String COL_NAME = "name";

	/*
	 * SQL CREATE TABLE
	 */
	public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
			+ " (" + COL_ID + " INTEGER PRIMARY KEY, " + COL_NAME
			+ " TEXT);";
	/*
	 * SQL DROP TABLE
	 */
	public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;
}
