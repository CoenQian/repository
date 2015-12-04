/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by JiongBull, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: ChapterFragment
 * Author: JiongBull
 * Create: 2015/12/3
 */
package com.jiongbull.tutorial.ui.view.book;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.bean.Topic;
import com.jiongbull.tutorial.constant.Extras;
import com.jiongbull.tutorial.ui.view.BaseFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Chapter fragment.
 */
public class ChapterFragment extends BaseFragment {

    private List<Topic> mTopics;

    /**
     * 实例化方法.
     *
     * @param bundle 初始化参数
     * @return 实例
     */
    public static ChapterFragment newInstance(@Nullable Bundle bundle) {
        ChapterFragment fragment = new ChapterFragment();
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.drawer_header;
    }

    @Override
    protected void initVariables() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            mTopics = bundle.getParcelableArrayList(Extras.TOPICS.getValue());
        }
    }

    @Override
    protected void initViews() {

    }

}