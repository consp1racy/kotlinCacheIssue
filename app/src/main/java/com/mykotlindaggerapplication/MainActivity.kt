package com.mykotlindaggerapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mykotlindaggerapplication.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var classToConvert: ClassToConvert

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerActivityComponent.builder().build().injectMainActivity(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
