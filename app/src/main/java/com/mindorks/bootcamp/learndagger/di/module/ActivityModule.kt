package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import android.content.Context

import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context =  activity

}
