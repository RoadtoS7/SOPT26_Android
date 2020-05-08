package com.tistory.comfy91.sopt26_android.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tistory.comfy91.sopt26_android.R
import com.tistory.comfy91.sopt26_android.data.RvData

class RecyclerViewAdapter(private val context: Context): RecyclerView.Adapter<RecyclerViewHolder>(){
    var datas = mutableListOf<RvData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_insta, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}