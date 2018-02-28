package com.evolve.daggerwithcustomclass.di.module

import android.content.Context
import com.evolve.daggerwithcustomclass.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by sujin on 2/28/18.
 */
@Module
class ActivityModule(val context: Context) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return context
    }
}