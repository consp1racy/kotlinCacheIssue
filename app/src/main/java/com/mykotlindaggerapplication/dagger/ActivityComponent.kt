package com.mykotlindaggerapplication.dagger

import com.mykotlindaggerapplication.test.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ActivityComponent {

    fun injectMainActivity(mainActivity: MainActivity)
}
