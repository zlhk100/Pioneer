/*
 * Copyright (c) 2014-2015 Sean Liu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.baoti.pioneer.ui.news.list;

import com.github.baoti.pioneer.entity.News;
import com.github.baoti.pioneer.ui.common.page.IPageView;
import com.nispok.snackbar.listeners.ActionClickListener;

/**
 * Created by liuyedong on 2015/1/2.
 */
public interface INewsListView extends IPageView<News> {

    void showSnackBar(String text, String actionLabel, ActionClickListener actionListener);
}
