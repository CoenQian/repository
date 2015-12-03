/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: ChapterFragmentFactory
 * Author: JiongBull
 * Create: 2015/12/3 0003
 */
package com.jiongbull.tutorial.ui.bean.factory;

import com.jiongbull.tutorial.ui.view.book.ChapterFragment;

import android.support.annotation.NonNull;

/**
 * Factory of chapter fragment.
 */
public interface ChapterFragmentFactory {

    /**
     * 创建指定的章节页面.
     *
     * @param mChapter 章节
     * @return 章节页面
     */
    ChapterFragment create(@NonNull String mChapter);
}
