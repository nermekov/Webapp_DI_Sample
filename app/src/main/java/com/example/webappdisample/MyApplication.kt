package com.example.webappdisample

import android.app.Application
import com.example.webappdisample.di.common.MyDependencies
import com.example.webappdisample.di.common.MyDependenciesGetter

internal class MyApplication: Application(), MyDependenciesGetter {
    private val component by lazy {
        DaggerWebappComponent.builder().build()
    }

    override fun getDependencies(): MyDependencies {
        return component
    }
}