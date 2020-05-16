package com.tistory.comfy91.sopt26_android.extension

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText


import retrofit2.Call
import android.widget.Toast

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



