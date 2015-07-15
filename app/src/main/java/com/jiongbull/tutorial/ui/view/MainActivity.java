/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: com.jiongbull.tutorial.ui.view.MainActivity
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/6/29 0029
 *
 * Changes (from 2015/6/29 0029)
 * -----------------------------------------------------------------
 * 2015/6/29 0029 : 创建 com.jiongbull.tutorial.ui.view.MainActivity (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.ui.view;

import com.jiongbull.tutorial.R;

import android.os.Bundle;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolBar() {
        super.initToolBar();

    }
}