package com.example.douwenxuan.apps;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.douwenxuan.dao.DaoMaster;
import com.example.douwenxuan.dao.DaoSession;
import com.example.douwenxuan.utils.MyDaoMaster;


public class MyApp extends Application {

    private static String DB_NAME = "1901A";


    public static MyApp myApp;

    private SQLiteDatabase sqLiteDatabase;
    private MyDaoMaster myDaoMaster;
    private DaoMaster daoMaster;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
        initDB();
    }

    private void initDB(){
        myDaoMaster = new MyDaoMaster(this,DB_NAME);
        sqLiteDatabase = myDaoMaster.getWritableDatabase();

        daoMaster = new DaoMaster(sqLiteDatabase);
        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }
}
