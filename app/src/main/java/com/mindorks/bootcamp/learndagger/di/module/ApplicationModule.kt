package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context

import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return "dummy_db"
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int? {
        return 1
    }

    @Provides
    @NetworkInfo
    fun provideApiKey(): String {
        return "SOME_API_KEY"
    }

}