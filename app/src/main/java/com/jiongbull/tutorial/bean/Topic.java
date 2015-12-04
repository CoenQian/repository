/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: Topic
 * Author: JiongBull
 * Create: 2015/12/3 0003
 */
package com.jiongbull.tutorial.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 专题.
 */
public class Topic implements Parcelable {

    public static final Parcelable.Creator<Topic> CREATOR = new Parcelable.Creator<Topic>() {
        public Topic createFromParcel(Parcel source) {
            return new Topic(source);
        }

        public Topic[] newArray(int size) {
            return new Topic[size];
        }
    };

    /** 名称. */
    private String mName;
    /** Activity全限定名. */
    private String mActivityName;

    public Topic() {
    }

    protected Topic(Parcel in) {
        this.mName = in.readString();
        this.mActivityName = in.readString();
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mName);
        dest.writeString(this.mActivityName);
    }
}