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

package com.jiongbull.repository.ui.view.drawer;

import com.jiongbull.jlog.JLog;
import com.jiongbull.repository.R;
import com.jiongbull.repository.app.RootApp;
import com.jiongbull.repository.bean.factory.AndroidArtChapterFragmentFactory;
import com.jiongbull.repository.ui.adapter.FragmentAdapter;
import com.jiongbull.repository.ui.view.BaseFragment;
import com.jiongbull.repository.ui.view.MainActivity;

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
            JLog.e(e, "parent activity must be MainActivity");
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
        AndroidArtChapterFragmentFactory androidArtChapterFragmentFactory = new AndroidArtChapterFragmentFactory(RootApp.getContext());
        for (String chapter : chapters) {
            tab = mTabLayout.newTab();
            tab.setText(chapter);
            mTabLayout.addTab(tab);
            mFragments.add(androidArtChapterFragmentFactory.createChapterFragment(chapter));
        }
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getFragmentManager(), mFragments, chapters);
        mViewPager.setAdapter(fragmentAdapter);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(fragmentAdapter);
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