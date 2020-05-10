package com.tistory.comfy91.sopt26_android.retrofitdata

data class ResponseSignIn (

    val status: Int,
    val success: Boolean,
    val message: String,
    val data: ResponseSignInData
)