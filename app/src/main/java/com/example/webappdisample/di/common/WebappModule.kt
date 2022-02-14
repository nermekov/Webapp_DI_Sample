package com.example.webappdisample.di.common

import com.example.webappdisample.domain.WebappRepository
import com.example.webappdisample.domain.WebappRepositoryImpl
import com.example.webappdisample.dummy.SomeOkHttp
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
internal interface WebappModule {
    @Provides
    fun provideOkHttp(): SomeOkHttp =
        SomeOkHttp("someConfig")

    @Binds
    fun bindWebappRepository(webappRepositoryImpl: WebappRepositoryImpl): WebappRepository
}