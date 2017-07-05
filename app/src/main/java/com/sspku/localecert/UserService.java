package com.sspku.localecert;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by zuosoul on 2017/6/29.
 */

public class UserService {
    String checkinfo;

    private DatabaseHelper dbHelper;
    public UserService(Context context){
        dbHelper=new DatabaseHelper(context);
    }
    //登录用
    public boolean login(String username,String password){
        SQLiteDatabase sdb=dbHelper.getReadableDatabase();
        String sql="select * from user where username=? and password=?";
        Cursor cursor=sdb.rawQuery(sql, new String[]{username,password});
        if(cursor.moveToFirst()==true){
            cursor.close();
            return true;
        }
        return false;
    }
    //注册用
    public boolean register(MyUser user){
        SQLiteDatabase sdb=dbHelper.getReadableDatabase();
        String sql1="select * from user where username=?";
        String sql="insert into user(username,password,email) values(?,?,?)";
        Object obj[]={user.getUsername(),user.getPassword(),user.getEmail()};
        Cursor cursor=sdb.rawQuery(sql1, new String[]{user.getUsername()});
        if(cursor.moveToFirst()==true){
            cursor.close();
            return false;
        }
        sdb.execSQL(sql, obj);
        return true;
    }

}
