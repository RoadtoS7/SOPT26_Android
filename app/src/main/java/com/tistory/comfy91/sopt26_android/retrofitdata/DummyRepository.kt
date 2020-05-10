package com.tistory.comfy91.sopt26_android.retrofitdata


import retrofit2.Call
import com.tistory.comfy91.sopt26_android.retrofit.RetrofitInterface
import retrofit2.Callback
import retrofit2.mock.Calls

class DummyRepository: RetrofitInterface{
    override fun requestSignUp(
        id: String,
        pw: String,
        name: String,
        email: String,
        phone: String
    ): Call<ResponseSignUp> {
        return Calls.response(
            ResponseSignUp(
                204,
                true,
                "회원가입 성공"
            )
        )
    }

    override fun requestSignIn(id: String, pw: String)
            : Call<ResponseSignIn> {
        return Calls.response(
            ResponseSignIn(
                200,
                true,
                "로그인 성공",
                ResponseSignInData(
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZHgiOjEsIm5hbWUiOiJnbmdzbiIsImlhdCI6MTU4ODU5NjEwOH0.ZvAXsth9RgtwvJRXdjuO3XC6A7uyeFNefhNxi2ok6R4"
                )
            )
        )
    }

}