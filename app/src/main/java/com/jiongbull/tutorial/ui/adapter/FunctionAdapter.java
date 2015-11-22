/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: FunctionAdapter
 * Author: JiongBull
 * Create: 2015/9/24
 */
package com.jiongbull.tutorial.ui.adapter;

import com.sf.module.edms.helper.R;
import com.sf.module.edms.helper.bean.Function;
import com.sf.module.edms.helper.ui.listener.OnItemClickListener;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 功能卡片适配器.
 */
public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder> {

    private Context mContext;

    private LayoutInflater mLayoutInflater;

    private List<Function> mFunctions;

    private OnItemClickListener mOnItemClickListener;

    public FunctionAdapter(Context context, List<Function> functions) {
        mContext = context;
        mFunctions = functions;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = mLayoutInflater.inflate(R.layout.item_function, viewGroup, false);
        return new ViewHolder(view, mOnItemClickListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Function function = mFunctions.get(i);
        viewHolder.mIvFigure.setImageResource(function.getFigureResId());
        viewHolder.mTvName.setText(function.getName());
    }

    @Override
    public int getItemCount() {
        return mFunctions == null ? 0 : mFunctions.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.iv_figure)
        ImageView mIvFigure;

        @Bind(R.id.tv_name)
        TextView mTvName;

        private OnItemClickListener mOnItemClickListener;

        public ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            mOnItemClickListener = listener;
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.card_function)
        void click(View v) {
            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemClick(v, getLayoutPosition());
            }
        }
    }
}