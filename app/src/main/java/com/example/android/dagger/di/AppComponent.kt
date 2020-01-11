package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    fun inject(RegistrationActivity: RegistrationActivity)
    fun inject(mainActivity: MainActivity)


    /*
    Factory to create instances of the app component
     **/
    @Component.Factory
    interface Factory {
        /*
          With @BindsInstance, the Context passed in will be available in the graph
        **/
        fun create(@BindsInstance context: Context): AppComponent
    }

}