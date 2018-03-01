package com.evolve.daggerwithcustomclass.di.module

import android.content.Context
import com.evolve.daggerwithcustomclass.custom.OkHttpClient
import com.evolve.daggerwithcustomclass.di.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Created by sujin on 2/28/18.
 */
@Module(includes = arrayOf(ContextModule::class))
class OkHttpClientModule {

    @Provides
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient {
        return OkHttpClient(context)
    }
}