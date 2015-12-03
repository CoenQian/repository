/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by JiongBull, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: AndroidArtFragment
 * Author: JiongBull
 * Create: 2015/12/1 0001
 */
package com.jiongbull.tutorial.ui.view.drawer;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.ui.view.BaseFragment;
import com.jiongbull.tutorial.ui.view.MainActivity;
import com.jiongbull.tutorial.ui.view.book.ChapterFragment;
import com.orhanobut.logger.Logger;

import android.content.Context;
import android.content.res.Configuration;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Android开发艺术探索.
 */
public class AndroidArtFragment extends BaseFragment {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.tab_layout)
    TabLayout mTabLayout;

    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawer;
    private MainActivity mMainActivity;

    private String[] chapters;
    private List<Fragment> mFragments;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mMainActivity = (MainActivity) mParentActivity;
        } catch (ClassCastException e) {
            Logger.e(e, "parent activity must be MainActivity");
            throw new ClassCastException(mParentActivity.toString() + " must be MainActivity");
        }
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_android_art;
    }

    @Override
    protected void initVariables() {
        chapters = getResources().getStringArray(R.array.android_art_chapters);
        mFragments = new ArrayList<>();

    }

    @Override
    protected void initViews() {
        mDrawer = mMainActivity.getDrawer();
        mDrawerToggle = new ActionBarDrawerToggle(mMainActivity, mDrawer, mToolbar, R.string.drawer_open, R.string
                .drawer_close);
        mDrawerToggle.syncState();

        mDrawer.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                mDrawerToggle.onDrawerSlide(drawerView, slideOffset);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                mDrawerToggle.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                mDrawerToggle.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                mDrawerToggle.onDrawerStateChanged(newState);
            }
        });

        TabLayout.Tab tab;
        for (String chapter : chapters) {
            tab = mTabLayout.newTab();
            tab.setText(chapter);
            mTabLayout.addTab(tab);
            mFragments.add(new ChapterFragment());
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}