package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule

import javax.inject.Inject
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, null)
    }

    private fun getDependencies() {
        DaggerFragmentComponent
                .builder()
                .applicationComponent((context!!.applicationContext as MyApplication).applicationComponent)
                .fragmentModule(FragmentModule(this))
                .build()
                .inject(this)

    }

}