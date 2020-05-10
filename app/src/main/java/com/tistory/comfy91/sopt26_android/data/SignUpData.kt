package com.tistory.comfy91.sopt26_android.data

import com.google.gson.annotations.SerializedName

data class SignUpData (
    @SerializedName("id")
    val id: String,
    @SerializedName("password")
    val pw: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phone")
    val phone: String
)