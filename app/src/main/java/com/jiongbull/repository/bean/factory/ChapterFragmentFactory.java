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

package com.jiongbull.repository.bean.factory;

import com.jiongbull.repository.bean.Topic;
import com.jiongbull.repository.constant.Extras;
import com.jiongbull.repository.ui.view.book.ChapterFragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory of chapter fragment.
 */
public abstract class ChapterFragmentFactory {

    /**
     * 创建指定的章节页面.
     *
     * @param mChapter 章节
     * @return 章节页面
     */
    public ChapterFragment createChapterFragment(@NonNull String mChapter) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Extras.TOPICS.getValue(), (ArrayList<Topic>) createTopics(mChapter));
        return ChapterFragment.newInstance(bundle);
    }

    public List<Topic> createTopics(Resources resources, int namesResId, int activityNamesResId) {
        String[] names = resources.getStringArray(namesResId);
        String[] activityNames = resources.getStringArray(activityNamesResId);
        if (names.length != activityNames.length) {
            throw new IllegalArgumentException("names's length must equals activityNames's length");
        }
        List<Topic> topics = new ArrayList<>();
        Topic topic;
        for (int i = 0; i < names.length; i++) {
            topic = new Topic();
            topic.setName(names[i]);
            topic.setActivityName(activityNames[i]);
            topics.add(topic);
        }
        return topics;
    }

    /**
     * 创建章节的主题.
     *
     * @param mChapter 章节
     * @return 主题
     */
    @NonNull
    public abstract List<Topic> createTopics(@NonNull String mChapter);
}
