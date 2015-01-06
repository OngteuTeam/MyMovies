package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.model.Category;
import android.content.ContentValues;

public class CategoryORM {

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
	
	/*
	 * @Decription: Function for Category
	 */

	public static long addCategory() {
		long result = -1;

		return result;
	}
	
	private static ContentValues convertToContentValues(Category category){
		 ContentValues values = new ContentValues();
		 values.put(CategoryORM.COL_ID, category.getId());
		 values.put(CategoryORM.COL_NAME, category.getName());
		 return values;
	}

	public static ArrayList<Category> getListCategory() {
		ArrayList<Category> list = new ArrayList<Category>();

		return list;
	}
	
}
