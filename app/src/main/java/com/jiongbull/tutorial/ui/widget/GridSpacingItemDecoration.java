/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: GridSpacingItemDecoration
 * Author: JiongBull
 * Create: 2015/9/25
 */
package com.jiongbull.tutorial.ui.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 网格空隙.
 */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /** 网格的列数. */
    private int mSpanCount;

    /** 间隙. */
    private int mSpacing;

    /** 是否包含边界. */
    private boolean mIsIncludeEdge;

    public GridSpacingItemDecoration(int spanCount, int spacing, boolean mIsIncludeEdge) {
        this.mSpanCount = spanCount;
        this.mSpacing = spacing;
        this.mIsIncludeEdge = mIsIncludeEdge;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int column = position % mSpanCount; // item column

        if (mIsIncludeEdge) {
            outRect.left = mSpacing
                    - column * mSpacing / mSpanCount; // mSpacing - column * ((1f / mSpanCount) * mSpacing)
            outRect.right = (column + 1) * mSpacing / mSpanCount; // (column + 1) * ((1f / mSpanCount) * mSpacing)

            if (position < mSpanCount) {
                outRect.top = mSpacing;
            }
            outRect.bottom = mSpacing;
        } else {
            outRect.left = column * mSpacing / mSpanCount; // column * ((1f / mSpanCount) * mSpacing)
            outRect.right = mSpacing
                    - (column + 1) * mSpacing / mSpanCount; // mSpacing - (column + 1) * ((1f / mSpanCount) * mSpacing)
            if (position >= mSpanCount) {
                outRect.top = mSpacing;
            }
        }
    }
}