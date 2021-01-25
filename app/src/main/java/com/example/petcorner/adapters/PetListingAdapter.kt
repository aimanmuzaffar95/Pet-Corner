package com.example.petcorner.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.R
import com.example.petcorner.databinding.ItemPetCategoryBinding
import com.example.petcorner.databinding.ItemPetListingBinding
import com.example.petcorner.models.PetCategory
import com.example.petcorner.models.PetModel

class PetListingAdapter(private val context: Context, private val list: ArrayList<PetModel>):
    RecyclerView.Adapter<PetListingAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemPetListingBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.item_pet_listing,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.catName.text = list[position].petName
        holder.binding.catDesc.text = list[position].petDescription
        holder.binding.catAge.text = list[position].petFeatures
        holder.binding.catGender.text = list[position].petGender
        holder.binding.catLocation.text = list[position].distance

        holder.binding.imageView3.setImageDrawable(ContextCompat.getDrawable(context, list[position].image))
    }

    override fun getItemCount(): Int {
        return list.size
    }

}