/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by Peanut Run, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: ThemeUtils
 * Author: JiongBull
 * Version: 1.0
 * Create: 2015/7/14 0014
 *
 * Changes (from 2015/7/14 0014)
 * -----------------------------------------------------------------
 * 2015/7/14 0014 : 创建 ThemeUtils (JiongBull);
 * -----------------------------------------------------------------
 */
package com.jiongbull.tutorial.util;

import android.content.Context;
import android.support.annotation.NonNull;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.constant.Preferences;

import java.util.HashMap;

/**
 * 主题工具.
 */
public class ThemeUtils {

    private static HashMap<Theme, Integer> sThemeStyles;

    static {
        sThemeStyles = new HashMap<>();
        sThemeStyles.put(Theme.BLUE, R.style.AppTheme_Blue);
        sThemeStyles.put(Theme.RED, R.style.AppTheme_Red);
        sThemeStyles.put(Theme.PINK, R.style.AppTheme_Pink);
        sThemeStyles.put(Theme.PURPLE, R.style.AppTheme_Purple);
        sThemeStyles.put(Theme.DEEP_PURPLE, R.style.AppTheme_DeepPurple);
        sThemeStyles.put(Theme.INDIGO, R.style.AppTheme_Indigo);
        sThemeStyles.put(Theme.LIGHT_BLUE, R.style.AppTheme_LightBlue);
        sThemeStyles.put(Theme.CYAN, R.style.AppTheme_Cyan);
        sThemeStyles.put(Theme.TEAL, R.style.AppTheme_Teal);
        sThemeStyles.put(Theme.GREEN, R.style.AppTheme_Green);
        sThemeStyles.put(Theme.LIGHT_GREEN, R.style.AppTheme_LightGreen);
        sThemeStyles.put(Theme.LIME, R.style.AppTheme_Lime);
        sThemeStyles.put(Theme.YELLOW, R.style.AppTheme_Yellow);
        sThemeStyles.put(Theme.AMBER, R.style.AppTheme_Amber);
        sThemeStyles.put(Theme.ORANGE, R.style.AppTheme_Orange);
        sThemeStyles.put(Theme.DEEP_ORANGE, R.style.AppTheme_DeepOrange);
        sThemeStyles.put(Theme.BROWN, R.style.AppTheme_Brown);
        sThemeStyles.put(Theme.GREY, R.style.AppTheme_Grey);
        sThemeStyles.put(Theme.BLUE_GREY, R.style.AppTheme_BlueGrey);
    }

    private ThemeUtils() {
    }

    /**
     * 设置主题.
     *
     * @param context {@link Context}
     * @param theme   {@link Theme}
     */
    public static void setTheme(@NonNull Context context, @NonNull Theme theme) {
        int style = sThemeStyles.get(theme);
        context.setTheme(style);
    }

    /**
     * 初始化主题.
     *
     * @param context {@link Context}
     */
    public static void initTheme(@NonNull Context context) {
        ThemeUtils.Theme theme = ThemeUtils.getCurTheme();
        ThemeUtils.setTheme(context, theme);
    }

    /**
     * 获取用户保存的布局.
     *
     * @return 用户保存的布局
     */
    public static Theme getCurTheme() {
        // TODO 有帐号系统的话, 应该使用以下方法获取主题, PreferenceUtils.getUserInt(Preferences.THEME);
        return Theme.parse(PreferenceUtils.getCommonInt(Preferences.THEME));
    }

    public enum Theme {

        BLUE(0x00), // 蓝色
        RED(0x01), // 红色
        PINK(0x02), // 粉色
        PURPLE(0x03), // 紫色
        DEEP_PURPLE(0x04), // 深紫色
        INDIGO(0x05), // 靛蓝色
        LIGHT_BLUE(0x06), // 浅蓝色
        CYAN(0x07), // 青绿色
        TEAL(0x08), // 青色
        GREEN(0x09), // 绿色
        LIGHT_GREEN(0x10), // 浅绿色
        LIME(0x11), // 绿黄色
        YELLOW(0x12), // 黄色
        AMBER(0x13), // 琥珀色
        ORANGE(0x14), // 橙色
        DEEP_ORANGE(0x15), // 深橙色
        BROWN(0x16), // 棕色
        GREY(0x17), // 灰色
        BLUE_GREY(0x18); // 蓝灰色

        private int mValue;

        Theme(int value) {
            mValue = value;
        }

        /**
         * 解析主题.
         *
         * @param value 主题代码
         * @return 对应的主题
         */
        public static Theme parse(int value) {
            for (Theme theme : Theme.values()) {
                if (value == theme.getValue()) {
                    return theme;
                }
            }
            return BLUE;
        }

        public int getValue() {
            return mValue;
        }
    }
}
