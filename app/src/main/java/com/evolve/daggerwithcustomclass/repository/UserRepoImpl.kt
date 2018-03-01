package com.evolve.daggerwithcustomclass.repository

import com.evolve.daggerwithcustomclass.custom.RandomUserAPI

/**
 * Created by sujin on 3/1/18.
 */
class UserRepoImpl : UserRepository {
    override fun insert(randomUserAPI: RandomUserAPI): String {
        return "Insert User implementation"
    }

    override fun getAll(): String {
        return "Get all user implementation"
    }

    override fun getById(): String {
        return "Get user by ID implementation"
    }
}