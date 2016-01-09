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

package com.jiongbull.tutorial.ui.view;

import com.jiongbull.tutorial.R;
import com.jiongbull.tutorial.ui.view.drawer.AndroidArtFragment;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import butterknife.Bind;

/**
 * 主页.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.drawer)
    DrawerLayout mDrawer;

    @Bind(R.id.navigation)
    NavigationView mNavigation;

    private AndroidArtFragment mAndroidArtFragment;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariables() {
    }

    @Override
    protected void initViews() {
        mNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                switch (item.getItemId()) {
                    case R.id.drawer_android_art:
                        if (mAndroidArtFragment == null) {
                            mAndroidArtFragment = new AndroidArtFragment();
                        }
                        fragmentManager.beginTransaction().replace(R.id.flyt_content, mAndroidArtFragment).commit();
                        break;
                    case R.id.drawer_settings:

                        break;
                    default:
                        break;
                }
                item.setChecked(true);
                mDrawer.closeDrawers();
                return true;
            }
        });
        if (mAndroidArtFragment == null) {
            mAndroidArtFragment = new AndroidArtFragment();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flyt_content, mAndroidArtFragment).commit();
    }

    public DrawerLayout getDrawer() {
        return mDrawer;
    }
}