package com.mindorks.bootcamp.learndagger.data.local

import android.content.Context

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
@Singleton
class DatabaseService @Inject
constructor(@ApplicationContext val context: Context,
            @DatabaseInfo val databaseName: String,
            @DatabaseInfo val version: Int?) {

    val dummyData: String = "DATABASE_DUMMY_DATA"

}
