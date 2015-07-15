/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: VersionUtils
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/7/15 0015
 *
 * Changes (from 2015/7/15 0015)
 * -----------------------------------------------------------------
 * 2015/7/15 0015 : 创建 VersionUtils (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.util;

import android.os.Build;

/**
 * 版本工具.
 */
public class VersionUtils {

    private VersionUtils() {
    }

    /**
     * 判断系统版本是否高于(含等于)2.2.
     *
     * @return true - 系统版本高于(含等于)2.2, false - 系统版本低于2.2
     */
    public static boolean hasFroyo() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
    }

    /**
     * 判断系统版本是否高于(含等于)2.3.
     *
     * @return true - 系统版本高于(含等于)2.3, false - 系统版本低于2.3
     */
    public static boolean hasGingerbread() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
    }

    /**
     * 判断系统版本是否高于(含等于)3.0.
     *
     * @return true - 系统版本高于(含等于)3.0, false - 系统版本低于3.0
     */
    public static boolean hasHoneycomb() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
    }

    /**
     * 判断系统版本是否高于(含等于)3.1.
     *
     * @return true - 系统版本高于(含等于)3.1, false - 系统版本低于3.1
     */
    public static boolean hasHoneycombMR1() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    /**
     * 判断系统版本是否高于(含等于)4.1.
     *
     * @return true - 系统版本高于(含等于)4.1, false - 系统版本低于4.1
     */
    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
    }

    /**
     * 判断系统版本是否高于(含等于)4.4.
     *
     * @return true - 系统版本高于(含等于)4.4, false - 系统版本低于4.4
     */
    public static boolean hasKitKat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }
}