package com.example.yuliiastelmakhovska.zooandroid;

import android.app.Activity;

/**
 * Created by yuliiastelmakhovska on 07/10/16.
 */

public class ProductFactory {

    public String getAppPath(Activity a) {
        return a.getApplicationContext().getFilesDir().getAbsolutePath();
    }
}
