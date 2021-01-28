package com.example.petcorner.binding.adapters

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.R
import com.example.petcorner.adapters.PetCategoryAdapter
import com.example.petcorner.models.PetCategory

@BindingAdapter("petAdapter")
fun bindPetAdapter (recyclerView: RecyclerView, list: ArrayList<PetCategory>) {
    if(list.isEmpty())
        return

    if(recyclerView.layoutManager == null) {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = PetCategoryAdapter(recyclerView.context, list)
    }
}

@BindingAdapter("isSelected")
fun bindSelection(textView: TextView, isSelected: Boolean) {
    if (isSelected) {
        textView.setTextColor(textView.context.getColor(R.color.white))
        textView.isSelected = true
        textView.setTypeface(null, Typeface.BOLD)
    } else {
        textView.setTextColor(textView.context.getColor(R.color.colorTextBlack))
        textView.isSelected = false
        textView.setTypeface(null, Typeface.NORMAL)
    }
}

@BindingAdapter("src")
fun loadImageDrawable(imageView: ImageView, drawable: Int) {
    imageView.setImageDrawable(ContextCompat.getDrawable(imageView.context, drawable))
}