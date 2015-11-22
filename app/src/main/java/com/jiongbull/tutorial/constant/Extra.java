/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: Extras
 * Author: JiongBull
 * Create: 2015/9/23
 */
package com.jiongbull.tutorial.constant;

/**
 * Extra.
 */
public enum Extra {

    /** 前缀, 请勿使用. */
    PRE("com.jiongbull.tutorial.extra."),
    INFO(PRE.mValue + "INFO"),
    NAME(PRE.mValue + "NAME");

    private String mValue;

    Extra(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }
}