/*
 * Copyright JiongBull 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jiongbull.repository.util;

import com.jiongbull.repository.app.RootApp;
import com.jiongbull.repository.constant.Preferences;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * SharePreferences工具.
 */
public class PreferenceUtils {

    /** 整型变量默认值. */
    public static final int DEFAULT_INT = -9999999;

    /** 长整形变量默认值. */
    public static final long DEFAULT_LONG = -9999999L;

    /** 浮点型变量默认值. */
    public static final float DEFAULT_FLOAT = -0.999999f;

    /** 布尔型变量默认值. */
    public static final boolean DEFAULT_BOOLEAN = false;

    /** 字符串变量默认值. */
    public static final String DEFAULT_STRING = "default_string";

    private static Context sContext;

    static {
        sContext = RootApp.getContext();
    }

    private PreferenceUtils() {
    }

    /**
     * 获取当前登录的帐号.
     *
     * @return 当前登录的帐号信息
     */
    public static String getCurAccount() {
        return getCommonString(Preferences.ACCOUNT);
    }

    /**
     * 获取当前用户属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static String getUserString(@NonNull String key) {
        return getString(key, false);
    }

    /**
     * 获取公共属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static String getCommonString(@NonNull String key) {
        return getString(key, true);
    }

    /**
     * 设置用户属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setUserString(@NonNull String key, @NonNull String value) {
        setString(key, value, false);
    }

    /**
     * 设置公共属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setCommonString(@NonNull String key, @NonNull String value) {
        setString(key, value, true);
    }

    /**
     * 获取当前用户属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static int getUserInt(@NonNull String key) {
        return getInt(key, false);
    }

    /**
     * 获取公共属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static float getCommonFloat(@NonNull String key) {
        return getFloat(key, true);
    }

    /**
     * 获取当前用户属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static float getUserFloat(@NonNull String key) {
        return getFloat(key, false);
    }

    /**
     * 获取公共属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static long getCommonLong(@NonNull String key) {
        return getLong(key, true);
    }

    /**
     * 获取当前用户属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static long getUserLong(@NonNull String key) {
        return getLong(key, false);
    }

    /**
     * 获取公共属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static boolean getCommonBoolean(@NonNull String key) {
        return getBoolean(key, true);
    }

    /**
     * 获取当前用户属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static boolean getUserBoolean(@NonNull String key) {
        return getBoolean(key, false);
    }

    /**
     * 获取公共属性值.
     *
     * @param key 键名
     * @return 属性值
     */
    public static int getCommonInt(@NonNull String key) {
        return getInt(key, true);
    }

    /**
     * 设置用户属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setUserInt(@NonNull String key, int value) {
        setInt(key, value, false);
    }

    /**
     * 设置公共属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setCommonInt(@NonNull String key, int value) {
        setInt(key, value, true);
    }

    /**
     * 设置用户属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setUserFloat(@NonNull String key, float value) {
        setFloat(key, value, false);
    }

    /**
     * 设置公共属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setCommonFloat(@NonNull String key, int value) {
        setFloat(key, value, true);
    }

    /**
     * 设置用户属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setUserLong(@NonNull String key, long value) {
        setLong(key, value, false);
    }

    /**
     * 设置公共属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setCommonLong(@NonNull String key, long value) {
        setLong(key, value, true);
    }

    /**
     * 设置用户属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setUserBoolean(@NonNull String key, boolean value) {
        setBoolean(key, value, false);
    }

    /**
     * 设置公共属性值.
     *
     * @param key   键名
     * @param value 键值
     */
    public static void setCommonBoolean(@NonNull String key, boolean value) {
        setBoolean(key, value, true);
    }

    /**
     * 是否是默认字符串类型值.
     *
     * @param value 待比较值
     * @return true - 是默认值, false - 不是默认值
     */
    public static boolean isDefault(String value) {
        return DEFAULT_STRING.equals(value);
    }

    /**
     * 是否是默认整型类型值.
     *
     * @param value 待比较值
     * @return true - 是默认值, false - 不是默认值
     */
    public static boolean isDefault(int value) {
        return DEFAULT_INT == value;
    }

    /**
     * 是否是默认浮点类型值.
     *
     * @param value 待比较值
     * @return true - 是默认值, false - 不是默认值
     */
    public static boolean isDefault(float value) {
        return DEFAULT_FLOAT == value;
    }

    /**
     * 是否是默认长整形类型值.
     *
     * @param value 待比较值
     * @return true - 是默认值, false - 不是默认值
     */
    public static boolean isDefault(long value) {
        return DEFAULT_LONG == value;
    }

    /**
     * 获取{@link SharedPreferences}.
     *
     * @param isCommon isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 对应的{@link SharedPreferences}
     */
    @Nullable
    private static SharedPreferences getPreferences(boolean isCommon) {
        SharedPreferences preferences;
        if (isCommon) {
            preferences = getCommonPreferences();
        } else {
            preferences = getUserPreferences();
        }
        return preferences;
    }

    /**
     * 获取公共的{@link SharedPreferences}.
     *
     * @return {@link SharedPreferences}
     */
    private static SharedPreferences getCommonPreferences() {
        return sContext.getSharedPreferences(Preferences.COMMON, Context.MODE_PRIVATE);
    }

    /**
     * 获取当前用户的{@link SharedPreferences}.
     *
     * @return {@link SharedPreferences}
     */
    @Nullable
    private static SharedPreferences getUserPreferences() {
        String curAccount = getCurAccount();
        if (!isDefault(curAccount)) {
            return sContext.getSharedPreferences(curAccount, Context.MODE_PRIVATE);
        }
        return null;
    }

    /**
     * 获取属性值.
     *
     * @param key      键名
     * @param isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 属性值
     */
    private static String getString(@NonNull String key, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.getString(key, DEFAULT_STRING);
        }
        return DEFAULT_STRING;
    }

    /**
     * 保存属性值.
     *
     * @param key   键名
     * @param value 键值.
     */
    @SuppressLint("CommitPrefEdits")
    private static void setString(@NonNull String key, @NonNull String value, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.edit()
                    .putString(key, value)
                    .commit();
        }
    }

    /**
     * 获取属性值.
     *
     * @param key      键名
     * @param isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 属性值
     */
    private static int getInt(@NonNull String key, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.getInt(key, DEFAULT_INT);
        }
        return DEFAULT_INT;
    }

    /**
     * 保存属性值.
     *
     * @param key   键名
     * @param value 键值.
     */
    @SuppressLint("CommitPrefEdits")
    private static void setInt(@NonNull String key, int value, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.edit()
                    .putInt(key, value)
                    .commit();
        }
    }

    /**
     * 获取属性值.
     *
     * @param key      键名
     * @param isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 属性值
     */
    private static float getFloat(@NonNull String key, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.getFloat(key, DEFAULT_FLOAT);
        }
        return DEFAULT_FLOAT;
    }

    /**
     * 保存属性值.
     *
     * @param key   键名
     * @param value 键值.
     */
    @SuppressLint("CommitPrefEdits")
    private static void setFloat(@NonNull String key, float value, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.edit()
                    .putFloat(key, value)
                    .commit();
        }
    }

    /**
     * 获取属性值.
     *
     * @param key      键名
     * @param isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 属性值
     */
    private static long getLong(@NonNull String key, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.getLong(key, DEFAULT_LONG);
        }
        return DEFAULT_LONG;
    }

    /**
     * 保存属性值.
     *
     * @param key   键名
     * @param value 键值.
     */
    @SuppressLint("CommitPrefEdits")
    private static void setLong(@NonNull String key, long value, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.edit()
                    .putLong(key, value)
                    .commit();
        }
    }

    /**
     * 获取属性值.
     *
     * @param key      键名
     * @param isCommon 是否是公共属性, true -公共属性, false - 用户属性
     * @return 属性值
     */
    private static boolean getBoolean(@NonNull String key, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.getBoolean(key, DEFAULT_BOOLEAN);
        }
        return DEFAULT_BOOLEAN;
    }

    /**
     * 保存属性值.
     *
     * @param key   键名
     * @param value 键值.
     */
    @SuppressLint("CommitPrefEdits")
    private static void setBoolean(@NonNull String key, boolean value, boolean isCommon) {
        SharedPreferences preferences = getPreferences(isCommon);
        if (preferences != null) {
            preferences.edit()
                    .putBoolean(key, value)
                    .commit();
        }
    }
}