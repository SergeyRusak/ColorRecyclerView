package com.sergeyrusak.recyclercolor

import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // получаем ссылку на текстовое поле в каждом элементе списка
    val tv = itemView.findViewById<TextView>(R.id.color)
    val cname = ColorUtils()

    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        // вывод кода цвета в 16-ричном виде
        tv.text = cname.getColorNameFromRgb(color.red,color.green,color.blue)
        tv.setOnClickListener{
            val t = Toast.makeText(it.context,itemView.context.getString(R.string.template, color),LENGTH_SHORT)
            t.show()

        }
    }
}
