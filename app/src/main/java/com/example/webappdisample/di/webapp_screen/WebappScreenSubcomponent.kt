package com.example.webappdisample.di.webapp_screen

import dagger.Subcomponent

@NarimsScope
@Subcomponent(
    modules = [
        WebappScreenDelegatesModule::class,
        WebappScreenFlowsModule::class
    ]
)
internal interface WebappScreenSubcomponent