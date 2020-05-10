package com.tistory.comfy91.sopt26_android.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitObj {
    val retrofit = Retrofit.Builder()
        .baseUrl("13.209.144.115:3333")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: RetrofitInterface= retrofit.create(RetrofitInterface::class.java)

}