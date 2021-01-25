package com.example.petcorner.binding.adapters

import android.graphics.Typeface
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.R
import com.example.petcorner.adapters.PetCategoryAdapter
import com.example.petcorner.models.PetCategory

@BindingAdapter(value = ["petAdapter"], requireAll = true)
fun bindPetAdapter (recyclerView: RecyclerView, list: ArrayList<PetCategory>) {
    if(list.isEmpty())
        return

    if(recyclerView.layoutManager == null) {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = PetCategoryAdapter(recyclerView.context, list)
    }
}

@BindingAdapter(value = ["isSelected"], requireAll = true)
fun bindSelection(textView: TextView, isSelected: Boolean) {
    if(isSelected) {
        textView.setTextColor(textView.context.getColor(R.color.white))
        textView.isSelected = true
        textView.setTypeface(null, Typeface.BOLD)
    } else {
        textView.setTextColor(textView.context.getColor(R.color.colorTextBlack))
        textView.isSelected = false
        textView.setTypeface(null, Typeface.NORMAL)
    }
}