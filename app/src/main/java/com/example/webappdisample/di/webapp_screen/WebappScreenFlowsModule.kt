package com.example.webappdisample.di.webapp_screen

import com.example.webappdisample.domain.Webapp
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableSharedFlow

@Module
internal abstract class WebappScreenFlowsModule {
    @Provides
    fun provideWebappFlow() = MutableSharedFlow<Webapp>()
}