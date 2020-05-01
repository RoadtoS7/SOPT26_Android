package com.tistory.comfy91.sopt26_android

import android.content.Intent
import android.content.pm.SigningInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요", Toast.LENGTH_LONG)
            }
            else{
                val intent = Intent(this@MainActivity, SignUpActivity::class.java)
                startActivityForResult(intent, SIGN_UP)
            }
        }
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        when(requestCode){
            100 ->{
                edtId.setText(intent?.getStringExtra("ID"))
                edtPw.setText(intent?.getStringExtra("PW"))
            }
        }


    }

    companion object{
        const val SIGN_UP = 100
    }
}
