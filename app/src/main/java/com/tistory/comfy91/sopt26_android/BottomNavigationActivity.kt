package com.tistory.comfy91.sopt26_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)


        // viewpager adapter
        bn_viewpager.adapter = MainPagerAdapter(supportFragmentManager)
        bn_viewpager.offscreenPageLimit = 2

    }
}
