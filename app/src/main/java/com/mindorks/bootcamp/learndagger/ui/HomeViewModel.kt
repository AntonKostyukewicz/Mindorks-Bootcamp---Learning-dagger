package com.mindorks.bootcamp.learndagger.ui

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper

@FragmentScope
class HomeViewModel(
        private var databaseService: DatabaseService,
        private var networkService: NetworkService,
        private var networkHelper: NetworkHelper)