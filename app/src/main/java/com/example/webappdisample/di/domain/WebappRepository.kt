package com.example.webappdisample.di.domain

internal interface WebappRepository {
    fun getWebappList(): List<Webapp>

    fun getOneWebapp(): Webapp
}