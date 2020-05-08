package com.tistory.comfy91.sopt26_android.BottomNavigationBar


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tistory.comfy91.sopt26_android.R
import com.tistory.comfy91.sopt26_android.RecyclerView.RecyclerViewAdapter
import com.tistory.comfy91.sopt26_android.RecyclerView.RvItemDecoration
import com.tistory.comfy91.sopt26_android.data.RvData
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private var datas = mutableListOf<RvData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewAdapter = RecyclerViewAdapter(view.context)
        rv_home.adapter = recyclerViewAdapter
        rv_home.layoutManager =
            LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        rv_home.addItemDecoration(RvItemDecoration(view.context))
        loadDatas()
    }

    private fun loadDatas() {
        datas.apply {
            add(
                RvData(
                    "아리아나그란데",
                    "https://cdn.pixabay.com/photo/2020/05/03/21/10/heart-5126772__480.png",
                    "https://cdn.pixabay.com/photo/2020/04/22/21/14/spring-5080092__480.png"
                )
            )
            add(
                RvData(
                    "art",
                    "https://cdn.pixabay.com/photo/2020/04/09/03/32/mono-line-art-5019541__480.png",
                    "https://cdn.pixabay.com/photo/2020/04/20/08/27/fifties-records-5067136__480.png"
                )
            )
            add(
                RvData(
                    "초상화",
                    "https://cdn.pixabay.com/photo/2020/05/01/17/50/jesse-jackson-5118378__480.png",
                    "https://cdn.pixabay.com/photo/2019/04/10/17/01/watercolour-4117519__480.png"
                )
            )
            add(
                RvData(
                    "라마",
                    "https://cdn.pixabay.com/photo/2020/05/01/16/19/guanaco-5117901__480.png",
                    "https://cdn.pixabay.com/photo/2018/01/31/16/12/beach-3121393__480.png"
                )
            )
        }
        recyclerViewAdapter.datas = datas
        recyclerViewAdapter.notifyDataSetChanged()
    }
}
