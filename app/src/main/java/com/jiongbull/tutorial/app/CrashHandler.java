/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: CrashHandler
 * Author: JiongBull
 * Create: 2015/11/17
 */
package com.jiongbull.tutorial.app;

import com.orhanobut.logger.Logger;

import android.content.Context;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * 崩溃异常猎人.
 */
public class CrashHandler implements UncaughtExceptionHandler {

    private Context mContext;

    public CrashHandler(final Context context) {
        mContext = context;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Logger.e(ex, "崩溃, 严重错误");
    }
}