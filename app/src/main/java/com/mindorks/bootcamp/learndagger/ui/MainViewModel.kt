package com.mindorks.bootcamp.learndagger.ui

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope

import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(val databaseService: DatabaseService, val networkService: NetworkService) {

    fun getSomeData(): String = "${databaseService.dummyData} : ${networkService.dummyData}"

}