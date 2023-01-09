
package com.henie.finalproject;

import android.content.res.Resources;
import com.henie.heniefont.Applicationclass;


public class MyApplicationclass extends Applicationclass {


    private static MyApplicationclass myApp;
    public static Resources resource;

    @Override
    public void onCreate() {
        super.onCreate();

        resource = getResources();
        myApp = this;


    }




}

