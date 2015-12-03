/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: AndroidArtChapterFragmentFactory
 * Author: JiongBull
 * Create: 2015/12/3 0003
 */
package com.jiongbull.tutorial.ui.bean.factory;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.ui.view.book.ChapterFragment;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Factory of Android Art's chapter fragment.
 */
public class AndroidArtChapterFragmentFactory implements ChapterFragmentFactory {

    private Context mContext;

    AndroidArtChapterFragmentFactory(@NonNull Context context) {
        mContext = context;
    }

    @Override
    public ChapterFragment create(@NonNull String mChapter) {
        if (getResString(R.string.chapter_1).equals(mChapter)) {

        } else if (getResString(R.string.chapter_2).equals(mChapter)) {

        }
        return null;
    }

    /**
     * 获取字符串资源.
     *
     * @param resId 资源标识
     * @return 字符串资源
     */
    private String getResString(int resId) {
        return mContext.getString(resId);
    }
}