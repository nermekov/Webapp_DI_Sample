package com.example.webappdisample.domain

import com.example.webappdisample.dummy.SomeOkHttp
import javax.inject.Inject

internal class WebappRepositoryImpl
@Inject constructor(someOkHttp: SomeOkHttp): WebappRepository {
    override fun getWebappList(): List<Webapp> {
        TODO("Not yet implemented")
    }

    override fun getOneWebapp(): Webapp {
        TODO("Not yet implemented")
    }
}