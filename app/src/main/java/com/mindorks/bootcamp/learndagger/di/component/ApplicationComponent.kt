package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    val networkService: NetworkService

    val databaseService: DatabaseService

    val networkHelper: NetworkHelper

}
