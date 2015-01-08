package aiti.m1403l.group1.data.orm;

import java.util.ArrayList;

import aiti.m1403l.group1.data.DatabaseWrapper;
import aiti.m1403l.group1.data.model.Category;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class CategoryORM {

	public static final String TABLE_NAME = "Category";
	static ContentValues values = new ContentValues();
	public static final String COL_ID = "id";
	static Category category = new Category();
	public static final String COL_NAME = "name";

	/*
	 * SQL CREATE TABLE
	 */
	public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
			+ " (" + COL_ID + " INTEGER PRIMARY KEY, " + COL_NAME + " TEXT);";
	/*
	 * SQL DROP TABLE
	 */
	public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;

	/*
	 * @Decription: Function for Category
	 */

	public static long addCategory(Context context) {
		long result = -1;

		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();

		try {
			convertToContentValues(category);

			result = mDB.insertOrThrow(TABLE_NAME, null, values);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	private static ContentValues convertToContentValues(Category category) {
		ContentValues values = new ContentValues();
		values.put(CategoryORM.COL_ID, category.getId());
		values.put(CategoryORM.COL_NAME, category.getName());
		return values;
	}

	private static Category convertToCategory(Cursor c) {
		Category cate = new Category();
		cate.setId(c.getInt(0));
		cate.setName(c.getString(1));
		return cate;
	}

	public static ArrayList<Category> getListCategory(Context context) {
		ArrayList<Category> list = new ArrayList<Category>();

		DatabaseWrapper databaseWrapper = new DatabaseWrapper(context);
		SQLiteDatabase mDB = databaseWrapper.getWritableDatabase();
		Cursor c = null;
		c = mDB.query(TABLE_NAME, null, null, null, null, null, null);
		if (c.moveToFirst()) {
			do {

				convertToCategory(c);

				list.add(category);
			} while (c.moveToNext());
		}

		return list;
	}

}
