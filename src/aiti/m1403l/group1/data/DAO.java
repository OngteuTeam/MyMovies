package aiti.m1403l.group1.data;

import java.util.ArrayList;

import aiti.m1403l.group1.data.entity.Category;
import aiti.m1403l.group1.data.entity.Film;
import aiti.m1403l.group1.data.table.*;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DAO extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "m1403l_movie.sqlite";
	private static final int DATABASE_VERSION = 1;

	public DAO(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TbCategory.SQL_CREATE_TABLE);
		db.execSQL(TbFilm.SQL_CREATE_TABLE);
		db.execSQL(TbFilmCategory.SQL_CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w("LOG_TAG", "Upgrading database from version " + oldVersion
				+ " to " + newVersion + ", which will destroy all old data");
		db.execSQL(TbFilmCategory.SQL_DROP_TABLE);
		db.execSQL(TbFilm.SQL_DROP_TABLE);
		db.execSQL(TbFilm.SQL_DROP_TABLE);
		onCreate(db);
	}

	/*
	 * @Decription: Function for Category
	 */

	public long addCategory() {
		long result = -1;

		return result;
	}

	public ArrayList<Category> getListCategory() {
		ArrayList<Category> list = new ArrayList<Category>();

		return list;
	}

	/*
	 * @Decription: Function for Film
	 */

	public long addFilm() {
		long result = -1;

		return result;
	}

	public long updateFilm() {
		long result = -1;

		return result;
	}

	public long deleteFilm() {
		long result = -1;

		return result;
	}

	public ArrayList<Film> getListFilm() {
		ArrayList<Film> list = new ArrayList<Film>();

		return list;
	}

	public ArrayList<Film> getSearchFilm() {
		ArrayList<Film> list = new ArrayList<Film>();

		return list;
	}
	
}
