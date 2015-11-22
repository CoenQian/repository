/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: OnItemClickListener
 * Author: JiongBull
 * Create: 2015/9/25
 */
package com.jiongbull.tutorial.ui.listener;

import android.view.View;

/**
 * 列表中的项目点击监听器.
 */
public interface OnItemClickListener {

    /**
     * 点击.
     *
     * @param v        被点击的视图
     * @param position 在列表中的索引
     */
    void onItemClick(View v, int position);
}
