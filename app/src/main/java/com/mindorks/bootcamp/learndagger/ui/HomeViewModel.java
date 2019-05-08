package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

@FragmentScope
public class HomeViewModel {

    DatabaseService databaseService;
    NetworkService networkService;
    NetworkHelper networkHelper;

    public HomeViewModel(
            DatabaseService databaseService,
            NetworkService networkService,
            NetworkHelper networkHelper) {
        this.databaseService = databaseService;
        this.networkHelper = networkHelper;
        this.networkService = networkService;
    }

}
