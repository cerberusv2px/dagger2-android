package com.evolve.daggerwithcustomclass

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.evolve.daggerwithcustomclass.custom.Picasso
import com.evolve.daggerwithcustomclass.custom.RandomUserAPI
import com.evolve.daggerwithcustomclass.di.component.DaggerActivityComponent
import com.evolve.daggerwithcustomclass.di.module.ActivityModule
import com.evolve.daggerwithcustomclass.repository.UserRepoImpl
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    @Inject
    lateinit var picasso: Picasso

    @Inject
    lateinit var randomUserAPI: RandomUserAPI

    @Inject
    lateinit var userRepoImpl: UserRepoImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .randomUserComponent(DaggerApplication.get(this).getRandomUserApplicationComponent())
            .build()
        activityComponent.inject(this)

        Log.e(TAG, picasso.getPicasso())
        Log.e(TAG, randomUserAPI.getRandomUserAPI())
        Log.e(TAG, userRepoImpl.insert(randomUserAPI))
    }
}
