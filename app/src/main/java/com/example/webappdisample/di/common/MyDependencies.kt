package com.example.webappdisample.di.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.webappdisample.domain.WebappRepository

internal interface MyDependencies {
    fun getWebappRepository(): WebappRepository

    fun getSomeViewmodelFactory(): ViewModelProvider.Factory
}