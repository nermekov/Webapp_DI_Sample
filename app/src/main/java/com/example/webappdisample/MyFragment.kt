package com.example.webappdisample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.webappdisample.di.common.MyDependenciesGetter

internal class MyFragment: Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dependencies = (context?.applicationContext as? MyDependenciesGetter)?.getDependencies()
        dependencies?.getWebappRepository()
        dependencies?.getSomeViewmodelFactory()
    }
}