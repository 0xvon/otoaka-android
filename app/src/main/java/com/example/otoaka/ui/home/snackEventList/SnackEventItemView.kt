package com.example.otoaka.ui.home.snackEventList

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import com.example.otoaka.R

class SnackEventItemView constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private val textView: TextView

    init {
        val rootView = LayoutInflater.from(context).inflate(R.layout.item_snack_event, this)
        textView = rootView.findViewById(R.id.event_title)
        setOnClickListener {
            // クリック処理
            Toast.makeText(context,"クリック", Toast.LENGTH_LONG).show()
        }
    }

    fun update(state: SnackEventState) {
        textView.text = state.snackPoint.toString()
    }
}
