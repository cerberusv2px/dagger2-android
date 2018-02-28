package com.evolve.daggerwithcustomclass

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.evolve.daggerwithcustomclass.di.component.DaggerRandomUserComponent
import com.evolve.daggerwithcustomclass.di.module.ContextModule

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randomUserComponent = DaggerRandomUserComponent.builder()
                .contextModule(ContextModule(this))
                .build()

        val picasso = randomUserComponent.getPicasso()
        val randomUserAPI = randomUserComponent.getRandomUserAPI()

        Log.e(TAG, picasso.getPicasso())
        Log.e(TAG, randomUserAPI.getRandomUserAPI())

    }
}
