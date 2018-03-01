package com.evolve.daggerwithcustomclass.di.module

import android.content.Context
import com.evolve.daggerwithcustomclass.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sujin on 2/28/18.
 */
@Module
class ContextModule(var context: Context) {

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context {
        return context.applicationContext
    }
}