package com.mindorks.bootcamp.learndagger.data.remote

import android.content.Context

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
@Singleton
class NetworkService @Inject
constructor(@ApplicationContext val context: Context,
            @NetworkInfo val apiKey: String) {

    val dummyData: String = "NETWORK_DUMMY_DATA"

}
