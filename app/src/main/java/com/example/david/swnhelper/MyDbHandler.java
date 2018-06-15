package com.example.david.swnhelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {
    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "SWNHelper.db";
    public static final String TABLE_NAME = "CharacterNames";
    public static final String COLUMN_ID = "CharacterFName";
    public static final String COLUMN_NAME = "CharacterLname";
    public static final String COLUMN_NAME2 = "CharacterEthnicity";
    //initialize the database
    public MyDBHandler(Context context, Stringname, SQLiteDatabase.CursorFactoryfactory, intversion) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {}
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
    public String loadHandler() {}
    public void addHandler(Student student) {}
    public Student findHandler(String studentname) {}
    public boolean deleteHandler(int ID) {}
    public boolean updateHandler(int ID, String name) {}
}
