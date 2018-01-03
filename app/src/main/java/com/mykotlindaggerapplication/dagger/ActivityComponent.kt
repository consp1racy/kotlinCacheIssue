package com.mykotlindaggerapplication.dagger

import com.mykotlindaggerapplication.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ActivityComponent {

    fun injectMainActivity(mainActivity: MainActivity)
}
