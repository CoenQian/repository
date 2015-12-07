/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: LifecycleActivity
 * Author: JiongBull
 * Create: 2015/12/7
 */
package com.jiongbull.tutorial.ui.view.book.androidart.chapter1;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.ui.view.BaseActivity;

import android.os.Bundle;

/**
 * Activity lifecycle.
 */
public class LifecycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_lifecycle;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }
}