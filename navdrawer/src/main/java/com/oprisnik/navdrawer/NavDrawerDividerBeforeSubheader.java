/*
 * Copyright 2015 Alexander Oprisnik
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

package com.oprisnik.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oprisnik.navdrawer.widget.NavDrawerLayout;

public class NavDrawerDividerBeforeSubheader extends NavDrawerDivider {

    @Override
    public View createView(Context context, ViewGroup container, boolean selected,
                           final NavDrawerLayout.NavigationListener listener) {
        return LayoutInflater.from(context).inflate(R.layout.navdrawer_divider_before_subheader, container, false);
    }
}