package com.tistory.comfy91.sopt26_android.retrofitdata

import com.google.gson.annotations.SerializedName

data class ResponseSignUp(
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("message")
    val message: String
)