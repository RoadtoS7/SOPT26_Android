package com.tistory.comfy91.sopt26_android.retrofit

import retrofit2.Call
import com.tistory.comfy91.sopt26_android.retrofitdata.ResponseSignIn
import com.tistory.comfy91.sopt26_android.retrofitdata.ResponseSignUp
import retrofit2.http.POST

interface RetrofitInterface {
    @POST("/user/signup")
    fun requestSignUp(
        id: String,
        pw: String,
        name: String,
        email:String,
        phone:String
    ): Call<ResponseSignUp>

    @POST("/user/signin")
    fun requestSignIn(
        id: String,
        pw: String
    ): Call<ResponseSignIn>
}