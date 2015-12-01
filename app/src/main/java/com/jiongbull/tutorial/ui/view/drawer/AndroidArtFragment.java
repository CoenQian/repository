/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: AndroidArtFragment
 * Author: JiongBull
 * Create: 2015/12/1 0001
 */
package com.jiongbull.tutorial.ui.view.drawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiongbull.tutorial.R;

/**
 * Android开发艺术探索.
 */
public class AndroidArtFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_android_art, container, false);
    }
}