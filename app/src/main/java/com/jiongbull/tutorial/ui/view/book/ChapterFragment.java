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

import com.jiongbull.tutorial.ui.view.BaseFragment;

/**
 * 章节.
 */
public class ChapterFragment extends BaseFragment {
x
    @Override
    protected int getLayoutResId() {
        return 0;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }

    /**
     * 专题.
     */
    public static class Topic {

        /** 名称. */
        private String mName;

        /** Activity全限定名. */
        private String mActivityName;

        public String getName() {
            return mName;
        }

        public void setName(String name) {
            mName = name;
        }

        public String getActivityName() {
            return mActivityName;
        }

        public void setActivityName(String activityName) {
            mActivityName = activityName;
        }
    }
}