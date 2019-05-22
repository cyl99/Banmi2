package com.example.youfeadaway.banmi.utils;

import android.content.Context;
import android.util.Log;




public class Logger {
    public static void logD(String tag,String msg){
        if (Constants.isDebug){
            Log.d(tag, "logD: "+msg);
        }
    }
}
