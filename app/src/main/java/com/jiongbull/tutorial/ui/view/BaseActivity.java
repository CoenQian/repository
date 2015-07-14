/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: BaseActivity
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/7/9 0009
 *
 * Changes (from 2015/7/9 0009)
 * -----------------------------------------------------------------
 * 2015/7/9 0009 : 创建 BaseActivity (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.ui.view;

import com.jiongbull.tutorial.util.ThemeUtils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity基类.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTheme();
    }

    /**
     * 设置主题.
     */
    private void initTheme() {
        ThemeUtils.Theme theme = ThemeUtils.getCurTheme();
        ThemeUtils.setTheme(this, theme);
    }
}