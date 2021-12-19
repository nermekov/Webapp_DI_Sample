package com.example.webappdisample.di.common

import com.example.webappdisample.domain.WebappRepository
import dagger.Binds
import dagger.Module

@Module
internal interface WebappModule {
    @Binds
    fun bindWebappRepository(): WebappRepository
}