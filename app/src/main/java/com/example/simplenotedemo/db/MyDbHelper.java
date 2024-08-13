package com.example.simplenotedemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * Github: https://github.com/Shisan1325
 * <p>
 * Project Name: simplenote demo
 * Created by 拾三 on 2024/8/13.
 **/

// 数据库帮助类
public class MyDbHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "simple_node.db";  // 数据库名称
    private static final int DB_VERSION = 1;    // 数据库版本

    public MyDbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);  // 创建数据库
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建表的SQL语句
        String sql = "create table simplenode (id integer primary key autoincrement,content text,time text)";
        db.execSQL(sql);    // 执行创建表的SQL语句
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 在数据库版本更新时执行操作
        // 可以在这里处理表结构的变更或数据迁移的逻辑
    }
}
