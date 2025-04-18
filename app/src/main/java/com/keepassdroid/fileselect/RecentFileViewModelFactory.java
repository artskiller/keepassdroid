/*
 * Copyright 2025 Brian Pellin.
 *
 * This file is part of KeePassDroid.
 *
 *  KeePassDroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  KeePassDroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePassDroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.keepassdroid.fileselect;

import android.app.Application;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

public class RecentFileViewModelFactory implements ViewModelProvider.Factory {
    private final Application application;
    private final RecentFileHistory fileHistory;

    public RecentFileViewModelFactory(Application application, RecentFileHistory fileHistory)
    {
        this.application = application;
        this.fileHistory = fileHistory;
    }

    @NotNull
    @SuppressWarnings("unchecked")
    @Override
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        return (T) new RecentFileViewModel(application, fileHistory);
    }
}