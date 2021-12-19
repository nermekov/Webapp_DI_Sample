package com.example.webappdisample.presentation

import com.example.webappdisample.domain.WebappRepository
import javax.inject.Inject

internal class WebappVM @Inject constructor(
    webappRepository: WebappRepository
)