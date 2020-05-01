package com.tistory.comfy91.sopt26_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUi()
    }

    fun initUi(){
        btnSignIn.setOnClickListener {
            if(edtId.text.isNullOrBlank() || edtPw.text.isNullOrBlank()){

            }
            else{

            }
        }
    }
}
