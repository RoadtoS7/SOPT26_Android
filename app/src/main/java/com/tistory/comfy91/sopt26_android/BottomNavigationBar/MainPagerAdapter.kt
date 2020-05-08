package com.tistory.comfy91.sopt26_android.BottomNavigationBar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tistory.comfy91.sopt26_android.BottomNavigationBar.HomeFragment
import com.tistory.comfy91.sopt26_android.BottomNavigationBar.LibararyFragment
import com.tistory.comfy91.sopt26_android.BottomNavigationBar.MypageFragment

/*
    ViewPager와 Fragment를 연결하기 위해서 Adapter가 필요하다.
    둘을 연결하면, 버튼을 클릭했을 때나 화면을 드래그 했을 때 Fragment가 전환되는 것을 할 수 있다.
 */
class MainPagerAdapter(fm: FragmentManager)
    : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> LibararyFragment()
            else -> MypageFragment()
        }
    }

    override fun getCount() = 3

}