/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by JiongBull, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: MainActivity
 * Author: JiongBull
 * Create: 2015/6/29
 */
package com.jiongbull.tutorial.ui.view;

import com.jiongbull.tutorial.R;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolBar() {
        super.initToolBar("测试");
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }
}