/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by JiongBull, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: Extras
 * Author: JiongBull
 * Create: 2015/9/23
 */
package com.jiongbull.tutorial.constant;

/**
 * Extras.
 */
public enum Extras {

    /** 前缀, 请勿使用. */
    PRE("com.jiongbull.tutorial.extra."),
    INFO(PRE.mValue + "INFO"),
    NAME(PRE.mValue + "NAME"),
    TOPICS(PRE.mValue + "TOPICS");

    private String mValue;

    Extras(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }
}