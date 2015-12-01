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

import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.ui.view.drawer.AndroidArtFragment;

import butterknife.Bind;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.drawer)
    DrawerLayout mDrawer;

    @Bind(R.id.navigation)
    NavigationView mNavigation;

    @Bind(R.id.flyt_content)
    FrameLayout mFlytContent;

    AndroidArtFragment mAndroidArtFragment;

//    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

//    @Override
//    protected void initToolBar() {
//        super.initToolBar("测试");
//    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
//        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
//        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, R.string.drawer_open, R.string.drawer_close);

//        mDrawer.setDrawerListener(new DrawerLayout.DrawerListener() {
//            @Override
//            public void onDrawerSlide(View drawerView, float slideOffset) {
//                mDrawerToggle.onDrawerSlide(drawerView, slideOffset);
//            }
//
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                mDrawerToggle.onDrawerOpened(drawerView);
//            }
//
//            @Override
//            public void onDrawerClosed(View drawerView) {
//                mDrawerToggle.onDrawerClosed(drawerView);
//            }
//
//            @Override
//            public void onDrawerStateChanged(int newState) {
//                mDrawerToggle.onDrawerStateChanged(newState);
//            }
//        });

        mNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentManager fragmentManager = getFragmentManager();
                switch (item.getItemId()) {
                    case R.id.drawer_android_art:
                        if (mAndroidArtFragment == null) {
                            mAndroidArtFragment = new AndroidArtFragment();
                        }
                        fragmentManager.beginTransaction().replace(R.id.flyt_content, mAndroidArtFragment).commit();
                        break;
                    case R.id.drawer_settings:

                        break;
                    default:
                        break;
                }
                item.setChecked(true);
                mDrawer.closeDrawers();
                return true;
            }
        });
    }
}