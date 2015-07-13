/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: RootApp
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/7/10 0010
 *
 * Changes (from 2015/7/10 0010)
 * -----------------------------------------------------------------
 * 2015/7/10 0010 : 创建 RootApp (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.app;

import com.jiongbull.tutorial.R;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import android.app.Application;
import android.content.Context;

/**
 * Root application.
 */
public class RootApp extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        initLogger();
    }

    /**
     * 初始化日志.
     */
    private void initLogger() {
        Logger.init(getString(R.string.app_name))
                .setMethodCount(2)
                .hideThreadInfo()
                .setLogLevel(LogLevel.FULL)
                .setMethodOffset(2);
    }

    public static Context getContext() {
        return sContext;
    }
}