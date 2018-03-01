package com.evolve.daggerwithcustomclass.repository

import com.evolve.daggerwithcustomclass.custom.RandomUserAPI

/**
 * Created by sujin on 3/1/18.
 */
interface UserRepository {

    fun insert(randomUserAPI: RandomUserAPI): String
    fun getAll(): String
    fun getById(): String
}