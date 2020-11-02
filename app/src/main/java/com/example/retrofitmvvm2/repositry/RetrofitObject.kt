package com.example.retrofitmvvm2.repositry

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {
    private val BASE_URL = "https://gorest.co.in"
    val retrofit: Retrofit by lazy  {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    fun getRetrofitInstance(): Retrofit {
        return retrofit
    }
}