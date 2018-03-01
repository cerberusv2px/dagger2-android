package com.evolve.daggerwithcustomclass.di.module

import com.evolve.daggerwithcustomclass.custom.OkHttpClient
import com.evolve.daggerwithcustomclass.custom.RandomUserAPI
import com.evolve.daggerwithcustomclass.custom.Retrofit
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sujin on 2/28/18.
 */
@Module(includes = [(OkHttpClientModule::class)])
class RandomUserModule {

    @Provides
    fun provideRandomUserAPI(retrofit: Retrofit): RandomUserAPI {
        return RandomUserAPI(retrofit)
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit(okHttpClient)
    }
}