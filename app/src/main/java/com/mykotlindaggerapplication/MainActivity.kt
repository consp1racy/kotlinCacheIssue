package com.mykotlindaggerapplication

import android.app.Activity
import android.os.Bundle
import com.mykotlindaggerapplication.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : Activity() {
    @Inject lateinit var classToConvert: ClassToConvert

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerActivityComponent.builder().build().injectMainActivity(this)
        super.onCreate(savedInstanceState)
    }
}
