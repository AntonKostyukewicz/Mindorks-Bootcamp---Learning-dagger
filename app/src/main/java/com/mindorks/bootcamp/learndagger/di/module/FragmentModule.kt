package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context
import androidx.fragment.app.Fragment

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext
import com.mindorks.bootcamp.learndagger.ui.HomeViewModel
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper

import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val mFragment: Fragment) {

    @Provides
    fun provideHomeViewModel(
            databaseService: DatabaseService,
            networkService: NetworkService,
            networkHelper: NetworkHelper): HomeViewModel {
        return HomeViewModel(databaseService, networkService, networkHelper)
    }

    @Provides
    @ActivityContext
    fun provideContext(): Context = mFragment.context!!

}