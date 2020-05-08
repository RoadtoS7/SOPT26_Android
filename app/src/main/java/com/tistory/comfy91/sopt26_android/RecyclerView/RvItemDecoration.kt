package com.tistory.comfy91.sopt26_android.RecyclerView

import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RvItemDecoration(private val context: Context): RecyclerView.ItemDecoration(){
    // 여백 사이즈 변수
    private var size10: Int = 0
    private var size5: Int = 0


     init{
         size10 = dpToPx(context, 10F)
         size5 = dpToPx(context, 5F)
     }

    // dp -> pixel
    // view 사이즈에 변화를 주거나 여백을 줄 때는 pixel 로 변환해야 한다.
    private fun dpToPx(context: Context, dp: Float): Int{

        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            context.resources.displayMetrics
        ).toInt()
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = size5
    }


}