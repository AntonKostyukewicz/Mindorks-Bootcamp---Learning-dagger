package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle

import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import javax.inject.Inject
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, HomeFragment())
        fragmentTransaction.commit()
    }

    fun getDependencies() {
        DaggerActivityComponent
                .builder()
                .applicationComponent((application as MyApplication).applicationComponent)
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)
    }

}
