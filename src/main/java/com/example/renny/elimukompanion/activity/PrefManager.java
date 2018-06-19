package com.example.renny.elimukompanion.activity;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by renny on 8/24/2017.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    int PRIVATE_MODE=0;

    private static final String PREF_NAME="elimukompanion-welcome";
    private static final String IS_FIRST_TIME_LAUNCH="IsFirstTimeLaunch";

    public PrefManager(Context context){
        this._context=context;
        pref=_context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor=pref.edit();
    }
    public void setFisrtTimeLaunch(boolean isFisrtTimeLaunch){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFisrtTimeLaunch);
        editor.commit();
    }
    public boolean isFirstTimeLaunch(){
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
}