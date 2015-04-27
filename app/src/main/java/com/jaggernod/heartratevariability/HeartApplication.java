package com.jaggernod.heartratevariability;

import com.inaka.galgo.Galgo;
import com.inaka.galgo.GalgoOptions;

import android.app.Application;
import android.graphics.Color;

/**
 * Created by Pawel Polanski on 4/26/15.
 */
public class HeartApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GalgoOptions options = new GalgoOptions.Builder()
                .numberOfLines(15)
                .backgroundColor(Color.parseColor("#D9d6d6d6"))
                .textColor(Color.BLACK)
                .textSize(15)
                .build();
        Galgo.enable(this, options);
    }
}
