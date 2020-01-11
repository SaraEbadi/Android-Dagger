
package com.example.android.dagger


import android.app.Application
import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.DaggerAppComponent
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.user.UserManager

open class MyApplication : Application() {

    val appComponent : AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

   open val userManager : UserManager by lazy {
       UserManager(SharedPreferencesStorage(this))
   }
}
