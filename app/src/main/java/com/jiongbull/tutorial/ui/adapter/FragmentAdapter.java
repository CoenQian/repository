/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: FragmentAdapter
 * Author: JiongBull
 * Create: 2015/12/3
 */
package com.jiongbull.tutorial.ui.adapter;

import com.orhanobut.logger.Logger;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Fragment adapter.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private String[] mTitles;

    public FragmentAdapter(@NonNull FragmentManager fm, @NonNull List<Fragment> fragments, @NonNull String[] titles) {
        super(fm);
        if (fragments.size() != mTitles.length) {
            Logger.e("fragment's size must equals title's size");
            throw new IllegalArgumentException("fragment's size must equals title's size");
        }
        mFragments = fragments;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}