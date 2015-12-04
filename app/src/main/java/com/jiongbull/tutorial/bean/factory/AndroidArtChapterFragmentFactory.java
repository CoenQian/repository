/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: AndroidArtChapterFragmentFactory
 * Author: JiongBull
 * Create: 2015/12/3 0003
 */
package com.jiongbull.tutorial.bean.factory;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.bean.Topic;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory of Android Art's chapter fragment.
 */
public class AndroidArtChapterFragmentFactory extends ChapterFragmentFactory {

    private Context mContext;
    private Resources mResources;

    public AndroidArtChapterFragmentFactory(@NonNull Context context) {
        mContext = context;
        mResources = mContext.getResources();
    }

    @NonNull
    @Override
    public List<Topic> createTopics(@NonNull String mChapter) {
        List<Topic> topics;
        if (getResString(R.string.chapter_1).equals(mChapter)) {
            topics = createTopics(mResources, R.array.android_art_chapter_1_function_names, R.array.android_art_chapter_1_function_intents);
        } else if (getResString(R.string.chapter_2).equals(mChapter)) {
            topics = createTopics(mResources, R.array.android_art_chapter_2_function_names, R.array.android_art_chapter_2_function_intents);
        } else {
            topics = new ArrayList<>();
        }
        return topics;
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