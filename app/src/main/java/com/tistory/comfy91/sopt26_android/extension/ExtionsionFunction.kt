package com.tistory.comfy91.sopt26_android.extension

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText


import retrofit2.Call
import android.widget.Toast
import retrofit2.Callback
import retrofit2.Response

// Context 확장 함수
fun Context.toast(msg: String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}

// text변화 확장 함수 : 함수를 매개 변수로 넘겨줌
fun EditText.onTextChanged(funTextChanged : (CharSequence?) -> Unit){
    this.addTextChangedListener(object: TextWatcher{
        override fun afterTextChanged(p0: Editable?) {}

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            funTextChanged(p0)
        }
    })

}

// Call enqueue 함수 확장함수로 간단하게 만들기
fun <ResponseType>Call<ResponseType>.enqueue(
    onFailure:(Call<ResponseType>, Throwable) -> Unit,
    onResponse: (Call<ResponseType>, Response<ResponseType>) -> Unit
){
    this.enqueue(object: Callback<ResponseType>{
        override fun onFailure(call: Call<ResponseType>, t: Throwable) {
            onFailure(call, t)
        }

        override fun onResponse(call: Call<ResponseType>, response: Response<ResponseType>) {
            onResponse(call, response)
        }
    })
}


