/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: Topic
 * Author: JiongBull
 * Create: 2015/12/3 0003
 */
package com.jiongbull.tutorial.ui.bean;

/**
 * 专题.
 */
public class Topic {

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