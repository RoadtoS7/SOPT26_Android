package com.tistory.comfy91.sopt26_android.data

import com.google.gson.annotations.SerializedName

data class SingInData(
    @SerializedName("id")
    val id: String,
    @SerializedName("password")
    val pw: String
)