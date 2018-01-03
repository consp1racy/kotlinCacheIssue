package test.com.mykotlindaggerapplication.dagger

import dagger.Component
import test.com.mykotlindaggerapplication.MainActivity
import javax.inject.Singleton

@Singleton
@Component
interface ActivityComponent {

    fun injectMainActivity(mainActivity: MainActivity)
}
