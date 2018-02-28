package com.evolve.daggerwithcustomclass.di.module

import android.content.Context
import com.evolve.daggerwithcustomclass.custom.OkHttp3Download
import com.evolve.daggerwithcustomclass.custom.OkHttpClient
import com.evolve.daggerwithcustomclass.custom.Picasso
import com.evolve.daggerwithcustomclass.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sujin on 2/28/18.
 */
@Module(includes = arrayOf(OkHttpClientModule::class))
class PicassoModule {

    @Provides
    @Singleton
    fun providePicasso(@ApplicationContext context: Context, okHttp3Download: OkHttp3Download): Picasso {
        return Picasso(context, okHttp3Download)
    }

    @Provides
    fun provideOkHttp3Download(okHttpClient: OkHttpClient): OkHttp3Download {
        return OkHttp3Download(okHttpClient)
    }
}