package com.evolve.daggerwithcustomclass.di.component

import com.evolve.daggerwithcustomclass.custom.Picasso
import com.evolve.daggerwithcustomclass.custom.RandomUserAPI
import com.evolve.daggerwithcustomclass.di.module.PicassoModule
import com.evolve.daggerwithcustomclass.di.module.RandomUserModule
import com.evolve.daggerwithcustomclass.di.module.UserModule
import com.evolve.daggerwithcustomclass.repository.UserRepoImpl
import dagger.Component
import javax.inject.Singleton

/**
 * Created by sujin on 2/28/18.
 */
@Singleton
@Component(modules = [
    (RandomUserModule::class),
    (PicassoModule::class),
    (UserModule::class)])
interface RandomUserComponent {
    fun getRandomUserAPI(): RandomUserAPI
    fun getPicasso(): Picasso
    fun getUserRepoImpl(): UserRepoImpl
}