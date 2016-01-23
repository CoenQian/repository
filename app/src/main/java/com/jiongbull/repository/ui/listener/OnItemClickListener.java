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

package com.jiongbull.repository.ui.listener;

import android.view.View;

/**
 * 列表中的项目点击监听器.
 */
public interface OnItemClickListener {

    /**
     * 点击.
     *
     * @param v        被点击的视图
     * @param position 在列表中的索引
     */
    void onItemClick(View v, int position);
}
