package com.tistory.comfy91.sopt26_android.ViewAndViewContainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.tistory.comfy91.sopt26_android.R
import kotlinx.android.synthetic.main.activity_constraint_dimention_ratio.*

class ConstraintDimensionRatioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_dimention_ratio)

        Glide.with(this@ConstraintDimensionRatioActivity).load(R.drawable.img_sopt).into(imgvDimensionRatio)
    }
}
