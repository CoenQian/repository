/*
 * -----------------------------------------------------------------
 * Copyright (C) 2015, by SF-Express, Shenzhen, All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: Runnings
 * Author: JiongBull
 * Create: 2015/9/24
 */
package com.jiongbull.tutorial.app;

import com.sf.module.edms.helper.constant.UDiskPath;
import com.sf.module.edms.helper.constant.UDiskState;

/**
 * 运行时的状态.
 */
public enum Runnings {

    INSTANCE;

    /** U盘状态. */
    private UDiskState mUDiskState;

    /** U盘路径. */
    private UDiskPath mUDiskPath;

    Runnings() {
        mUDiskState = UDiskState.DEFAULT;
        mUDiskPath = UDiskPath.SUPPLIER_UNKNOW;
    }

    public UDiskState getUDiskState() {
        return mUDiskState;
    }

    public synchronized void setUDiskState(UDiskState UDiskState) {
        mUDiskState = UDiskState;
    }

    public UDiskPath getUDiskPath() {
        return mUDiskPath;
    }

    public synchronized void setUDiskPath(UDiskPath UDiskPath) {
        mUDiskPath = UDiskPath;
    }
}
