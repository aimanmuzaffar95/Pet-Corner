package com.example.petcorner.binding.adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.adapters.PetListingAdapter
import com.example.petcorner.models.PetModel

@BindingAdapter("petListAdapter")
fun bindPetListAdapter(recyclerView: RecyclerView, list: ArrayList<PetModel>) {
    if (list.isEmpty())
        return

    if (recyclerView.layoutManager == null) {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.VERTICAL, false)
    }

    recyclerView.adapter = PetListingAdapter(recyclerView.context, list)
}