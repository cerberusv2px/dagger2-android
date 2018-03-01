package com.evolve.daggerwithcustomclass

import android.app.Activity
import android.app.Application
import com.evolve.daggerwithcustomclass.di.component.DaggerRandomUserComponent
import com.evolve.daggerwithcustomclass.di.component.RandomUserComponent
import com.evolve.daggerwithcustomclass.di.module.ContextModule

/**
 * Created by sujin on 3/1/18.
 */
class DaggerApplication : Application() {

    private lateinit var randomUserComponent: RandomUserComponent

    companion object {
        fun get(activity: Activity): DaggerApplication {
            return activity.application as DaggerApplication
        }
    }

    override fun onCreate() {
        super.onCreate()
        randomUserComponent = DaggerRandomUserComponent.builder()
            .contextModule(ContextModule(this)).build()
    }

    fun getRandomUserApplicationComponent(): RandomUserComponent {
        return randomUserComponent
    }
}