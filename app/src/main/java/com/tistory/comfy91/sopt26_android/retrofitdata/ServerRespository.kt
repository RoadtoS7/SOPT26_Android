package com.tistory.comfy91.sopt26_android.retrofitdata

import com.tistory.comfy91.sopt26_android.retrofit.RetrofitInterface
import com.tistory.comfy91.sopt26_android.retrofit.RetrofitObj
import retrofit2.Call

class ServerRespository : RetrofitInterface{
    override fun requestSignUp(
        id: String,
        pw: String,
        name: String,
        email: String,
        phone: String
    ): Call<ResponseSignUp> {
        return RetrofitObj
            .service
            .requestSignUp(
                id,
                pw,
                name,
                email,
                phone
        )
    }

    override fun requestSignIn(id: String, pw: String): Call<ResponseSignIn> {
        return RetrofitObj.service
            .requestSignIn(id, pw)
    }

}