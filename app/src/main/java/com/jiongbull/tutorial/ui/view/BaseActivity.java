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

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.util.ThemeUtils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Activity基类.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTheme();
        setContentView(getLayoutResID());
        ButterKnife.bind(this);
        initToolBar();
    }

    protected abstract int getLayoutResID();

    /**
     * 淡化SystemBar.
     */
    public void dimSystemBar() {
        int uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
        manageSystemBar(uiOptions);
    }

    /**
     * 显示SystemBar.
     */
    public void revealSystemBar() {
        int uiOptions = 0;
        manageSystemBar(uiOptions);
    }

    /**
     *
     */
    public void hideStatusBar() {
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        manageSystemBar(uiOptions);
    }

    /**
     * 设置主题.
     */
    private void initTheme() {
        ThemeUtils.Theme theme = ThemeUtils.getCurTheme();
        ThemeUtils.setTheme(this, theme);
    }

    /**
     * 管理系统栏.
     *
     * @param uiOptions 系统栏的状态
     */
    private void manageSystemBar(int uiOptions) {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(uiOptions);
    }

    protected void initToolBar() {
        if (mToolbar == null) {
            return;
        }
        setSupportActionBar(mToolbar);
//        mToolbar.setTitle("Jiong");
//        mToolbar.setSubtitle("Bull");
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
    }
}