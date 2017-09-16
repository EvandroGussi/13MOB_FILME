package com.example.evandro.app13mob.SharedPreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Evandro on 15/09/2017.
 */

public class SaveSharedPreference
{
    static final String PREF_USER_NAME= "username";
    static Context _context;

    public SaveSharedPreference(Context context){
        this._context = context;
    }

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String userName)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_NAME, userName);
        editor.commit();
    }

    public static String getUserName(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME, "");
    }

    public static void clearUserName()
    {
        SharedPreferences.Editor editor = getSharedPreferences(_context).edit();
        editor.clear(); //clear all stored data
        editor.commit();
    }
}