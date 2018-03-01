package com.evolve.daggerwithcustomclass.di.module

import com.evolve.daggerwithcustomclass.repository.UserRepoImpl
import dagger.Module
import dagger.Provides

/**
 * Created by sujin on 3/1/18.
 */
@Module(includes = [(RandomUserModule::class)])
class UserModule {

    @Provides
    fun provideUserRepoImpl(): UserRepoImpl {
        return UserRepoImpl()
    }
}