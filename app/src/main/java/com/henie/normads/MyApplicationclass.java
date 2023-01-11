
package com.henie.normads;

import android.content.res.Resources;
import com.henie.heniefsd.Applicationclass;


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

