package com.tistory.comfy91.sopt26_android.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.tistory.comfy91.sopt26_android.R
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        // viewpager adapter
        bn_viewpager.adapter =
            MainPagerAdapter(
                supportFragmentManager
            )
        bn_viewpager.offscreenPageLimit = 2

        // viewpagr와 bottom navigation view 연결
        bottom_navigation_view.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_home -> bn_viewpager.currentItem = 0
                R.id.menu_book -> bn_viewpager.currentItem = 1
                R.id.menu_person -> bn_viewpager.currentItem = 2
            }
            true
        }

        bn_viewpager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                bottom_navigation_view.menu.getItem(position).isChecked = true
            }

        })

    }
}
