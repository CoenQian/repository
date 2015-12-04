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
import com.jiongbull.tutorial.ui.view.drawer.AndroidArtFragment;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import butterknife.Bind;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.drawer)
    DrawerLayout mDrawer;

    @Bind(R.id.navigation)
    NavigationView mNavigation;

    private AndroidArtFragment mAndroidArtFragment;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariables() {
    }

    @Override
    protected void initViews() {
        mNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
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
        if (mAndroidArtFragment == null) {
            mAndroidArtFragment = new AndroidArtFragment();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flyt_content, mAndroidArtFragment).commit();
    }

    public DrawerLayout getDrawer() {
        return mDrawer;
    }
}