package com.evolve.daggerwithcustomclass.custom

import android.content.Context

/**
 * Created by sujin on 2/28/18.
 */
class Picasso(context: Context, okHttp3Download: OkHttp3Download) {

    fun getPicasso(): String {
        return "Picasso"
    }
}