package com.example.webappdisample.di.common

import com.example.webappdisample.dummy.OtherModulePublicApi
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        WebappModule::class
    ],
    dependencies = [
        OtherModulePublicApi::class
    ]
)
@Singleton
internal interface WebappComponent {

}