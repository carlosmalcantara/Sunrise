package com.carlosalcantara.sunrise.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    //val baseUrl = "http://dataservice.accuweather.com/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}