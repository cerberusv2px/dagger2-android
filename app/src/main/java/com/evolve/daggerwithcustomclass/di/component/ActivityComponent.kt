package com.evolve.daggerwithcustomclass.di.component

import com.evolve.daggerwithcustomclass.MainActivity
import com.evolve.daggerwithcustomclass.di.module.ActivityModule
import com.evolve.daggerwithcustomclass.di.scope.ActivityScope
import dagger.Component

/**
 * Created by sujin on 3/1/18.
 */

@ActivityScope
@Component(
        dependencies = [(RandomUserComponent::class)],
        modules = [(ActivityModule::class)]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}