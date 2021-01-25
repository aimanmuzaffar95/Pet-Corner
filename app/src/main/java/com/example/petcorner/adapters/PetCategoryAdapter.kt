package com.example.petcorner.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.R
import com.example.petcorner.databinding.ItemPetCategoryBinding
import com.example.petcorner.models.PetCategory

class PetCategoryAdapter(private val context: Context, private val list: ArrayList<PetCategory>):
    RecyclerView.Adapter<PetCategoryAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemPetCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.item_pet_category,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.petCategory = list[position]
        holder.binding.executePendingBindings()

        holder.itemView.setOnClickListener {
            if(!list[position].isSelected) {
                unselectAll()
                list[position].isSelected = true
                notifyDataSetChanged()
            }
        }
    }

    private fun unselectAll() {
        for(item in list) {
            item.isSelected = false
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}