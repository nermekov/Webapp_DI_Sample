package com.example.webappdisample.dummy

import com.example.webappdisample.domain.WebappRepository
import kotlinx.coroutines.flow.MutableSharedFlow

internal class DelegateBImpl(
    webappRepository: WebappRepository,
    loaderFlow: MutableSharedFlow<Boolean>
) : DelegateB {
}