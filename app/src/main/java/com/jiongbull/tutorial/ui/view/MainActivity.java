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

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.jiongbull.tutorial.R;

import butterknife.Bind;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.drawer)
    DrawerLayout mDrawer;

    @Bind(R.id.navigation)
    NavigationView mNavigation;

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
        mNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                item.setChecked(true);
                mDrawer.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean flag = false;
        switch (item.getItemId()) {
            case R.id.drawer_android_art:
                flag = true;
                break;
            case R.id.drawer_settings:
                flag = true;
                break;
            default:
                break;
        }
        return flag;
    }
}