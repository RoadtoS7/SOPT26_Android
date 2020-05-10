package com.tistory.comfy91.sopt26_android.retrofitdata

import com.google.gson.annotations.SerializedName

data class ResponseSignInData(
    @SerializedName("jwt")
    val jwt: String
)