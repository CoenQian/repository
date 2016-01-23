/*
 * Copyright JiongBull 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jiongbull.repository.app;

import com.jiongbull.jlog.JLog;
import com.jiongbull.repository.R;
import com.jiongbull.repository.util.ThemeUtils;

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
        initJLog();
//        initStetho();
        ThemeUtils.initTheme(this);
//        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler(this));
    }

    /**
     * 初始化日志.
     */
    private void initJLog() {
        JLog.init(this)
                .setLogDir(getString(R.string.app_name))
                .writeToFile(true)
                .setDebug(true);
    }

    /**
     * 初始化Stetho.
     */
//    private void initStetho() {
//        Stetho.initializeWithDefaults(this);
//    }
    public static Context getContext() {
        return sContext;
    }

}