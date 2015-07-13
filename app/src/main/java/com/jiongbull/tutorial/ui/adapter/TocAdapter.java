/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: TocAdapter
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/7/9 0009
 *
 * Changes (from 2015/7/9 0009)
 * -----------------------------------------------------------------
 * 2015/7/9 0009 : 创建 TocAdapter (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.ui.adapter;

import com.jiongbull.tutorial.R;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * .
 */
public class TocAdapter extends RecyclerView.Adapter <TocAdapter.TocViewHolder>{


    @Override
    public TocViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(TocViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class TocViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_title)
        TextView mTvTitle;

        public TocViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
//            mTvTitle.setOnClickListener();
        }
    }
}