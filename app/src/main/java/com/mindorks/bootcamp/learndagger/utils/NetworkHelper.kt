package com.mindorks.bootcamp.learndagger.utils

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor(@ApplicationContext val context: Context) {

    val isNetworkConnected: Boolean = false

}