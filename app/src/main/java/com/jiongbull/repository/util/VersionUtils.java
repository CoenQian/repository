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