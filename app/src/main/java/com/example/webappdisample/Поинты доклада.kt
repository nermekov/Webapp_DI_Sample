package com.example.webappdisample

import com.example.webappdisample.domain.WebappRepository
import com.example.webappdisample.dummy.DelegateAImpl
import com.example.webappdisample.dummy.DelegateBImpl
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

//Субкомпонент нужен для очень большой screen фичи по типу web app
//Субкомпонент будет создаваться для каждого `new WebappViewModel()`
//Субкомпонент переиспользует инстансы зависимостей из компонента

//1. Без subcomponent трудно шейрить Flow/Livedata между Delegates
//*Возможно есть и другие пути это разрешить через Dagger, но я пока не знаю
private class ViewModelNoSubcomponent @Inject constructor (
    private val webappRepository: WebappRepository
) {
    //Флоу это объект с малым жизненный циклом - 1 экран
    private val loaderFlow = MutableSharedFlow<Boolean>()

    //Затрудняет прокинуть Абстрактный Delegate
    private val delegateA = DelegateAImpl(webappRepository, loaderFlow)
    //Придётся перекомпилировать при добавлении новых параметров
    private val delegateB = DelegateBImpl(webappRepository, loaderFlow)
}