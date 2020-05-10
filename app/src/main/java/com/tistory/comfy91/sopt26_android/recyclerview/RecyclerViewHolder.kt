package com.tistory.comfy91.sopt26_android.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tistory.comfy91.sopt26_android.R
import com.tistory.comfy91.sopt26_android.data.RvData

class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val imgProfile: ImageView = itemView.findViewById(R.id.img_profile)
    private val tvUserName: TextView = itemView.findViewById(R.id.tv_username)
    private val imgContents: ImageView = itemView.findViewById(R.id.img_contents)

    fun bind(rvData: RvData){
        Glide.with(itemView).load(rvData.imgContents).into(imgContents)
        Glide.with(itemView).load(rvData.imgProfile).into(imgProfile)
        tvUserName.text = rvData.userName
    }
}