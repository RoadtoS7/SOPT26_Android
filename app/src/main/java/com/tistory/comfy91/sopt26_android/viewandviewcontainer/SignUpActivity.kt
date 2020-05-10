package com.tistory.comfy91.sopt26_android.viewandviewcontainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tistory.comfy91.sopt26_android.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        tv_sign_up.setOnClickListener {
            if(tvId.text.isNullOrBlank() || tvPw.text.isNullOrBlank()){
                Toast.makeText(this, "아이디나 패스워드를 입력해주세요.", Toast.LENGTH_LONG).show()
            }
            if(tvPw.text != tvRePw.text) {
                Toast.makeText(this, "패스워드가 일치하지 않습니다.", Toast.LENGTH_LONG).show()
            }
            val intent = Intent()
            intent.putExtra("ID", tvId.text)
            intent.putExtra("PW", tvPw.text)
            finish()
        }
    }
}
