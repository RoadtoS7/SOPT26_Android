package com.tistory.comfy91.sopt26_android.viewandviewcontainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tistory.comfy91.sopt26_android.R
import com.tistory.comfy91.sopt26_android.bottomnavigationbar.BottomNavigationActivity
import com.tistory.comfy91.sopt26_android.retrofitdata.ResponseSignIn
import com.tistory.comfy91.sopt26_android.retrofitdata.ServerRespository
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private val respository = ServerRespository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUi()
    }

    private fun initUi(){
        val id = edt_id.text
        val pw = edt_pw.text
        btn_sign_in.setOnClickListener {
            if(id.isNullOrBlank() || pw.isNullOrBlank()){
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요", Toast.LENGTH_LONG)
            }
            else{
                requestSignIn(id.toString(), pw.toString())
            }
        }


    }

    private fun requestSignIn(id: String, pw: String){
        respository.requestSignIn(id, pw)
            .enqueue(object: Callback<ResponseSignIn> {
                override fun onFailure(call: Call<ResponseSignIn>, t: Throwable) {
                    Log.d("TAG", "requestSignIn onFailure (message :${t.message}")
                    Toast.makeText(this@MainActivity, "통신이 불완전하여 로그인에 실패했습니다.", Toast.LENGTH_LONG)
                }

                override fun onResponse(
                    call: Call<ResponseSignIn>,
                    response: Response<ResponseSignIn>
                ) {
                    if(response.isSuccessful){
                        //Returns true if {@link #code()} is in the range [200..300). */
                        if(response.body()?.success!!){
                            val intent = Intent(this@MainActivity, BottomNavigationActivity::class.java)
                            startActivity(intent)
                        }
                        else{
                            Log.d("TAG", "requestSignIn onSuccess but response body success is not true " +
                                    "(status code:${response.code()}) " +
                                    "(message: ${response.message()})"+
                                    "(errorBody: ${response.errorBody()})")
                            Toast.makeText(this@MainActivity, "통신이 불완전하여 로그인에 실패했습니다.", Toast.LENGTH_LONG)
                        }
                    }
                    else{
                        Log.d("TAG", "requestSignIn onSuccess but response code is not 200 ~ 300 " +
                                "(status code:${response.code()}) " +
                                "(message: ${response.message()})"+
                                "(errorBody: ${response.errorBody()})")
                        Toast.makeText(this@MainActivity, "통신이 불완전하여 로그인에 실패했습니다.", Toast.LENGTH_LONG)
                    }
                }
            })

    }
    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        when(requestCode){
            100 ->{
                edt_id.setText(intent?.getStringExtra("ID"))
                edt_pw.setText(intent?.getStringExtra("PW"))
            }
        }

    }

    companion object{
        const val SIGN_UP = 100
    }
}
