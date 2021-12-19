package com.example.webappdisample.domain

internal interface WebappRepository {
    fun getWebappList(): List<Webapp>

    fun getOneWebapp(): Webapp
}