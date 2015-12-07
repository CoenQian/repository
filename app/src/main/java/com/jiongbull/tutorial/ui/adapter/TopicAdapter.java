/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: TopicAdapter
 * Author: JiongBull
 * Create: 2015/12/7
 */
package com.jiongbull.tutorial.ui.adapter;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.bean.Topic;
import com.jiongbull.tutorial.ui.listener.OnItemClickListener;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Topic's Adapter.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<Topic> mTopics;
    private OnItemClickListener mOnItemClickListener;

    public TopicAdapter(Context context,List<Topic> topics) {
        mContext = context;
        mTopics = topics;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_topic, parent, false);
        return new ViewHolder(view, mOnItemClickListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Topic topic = mTopics.get(position);
        holder.mTvTopic.setText(topic.getName());
    }

    @Override
    public int getItemCount() {
        return mTopics == null ? 0 : mTopics.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_topic)
        TextView mTvTopic;

        private OnItemClickListener mOnItemClickListener;

        public ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            mOnItemClickListener = listener;
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.card_topic)
        void click(View v) {
            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemClick(v, getLayoutPosition());
            }
        }
    }
}