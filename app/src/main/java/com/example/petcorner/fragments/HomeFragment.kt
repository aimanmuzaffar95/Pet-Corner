package com.example.petcorner.fragments

import android.graphics.Typeface.BOLD
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petcorner.R
import com.example.petcorner.adapters.PetListingAdapter
import com.example.petcorner.databinding.FragmentHomeBinding
import com.example.petcorner.models.PetCategory
import com.example.petcorner.models.PetModel


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var petCategoryList: ArrayList<PetCategory>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        setupPetCategoryFilter()
        setupPetRecycler()
        return binding.root
    }

    private fun setupPetCategoryFilter() {
        petCategoryList = arrayListOf(
            PetCategory("Cats", true),
            PetCategory("Dogs"),
            PetCategory("Birds"),
            PetCategory("Mice"),
            PetCategory("Rabbits"),
            PetCategory("Bunnies"),
            PetCategory("Parrots"),
        )
        binding.petCategoryList = petCategoryList
    }

    private fun setupPetRecycler() {
        val petList = arrayListOf(
            PetModel("Lilly", "Cute Cate", "6 Months Old / 1 feet length", "Gender: Female", "10 Miles", R.drawable.cat1),
            PetModel("Furry", "Cute White Gray Cat", "2 Months Old / 1 feet length", "Gender: Female", "18 Miles", R.drawable.cat2),
            PetModel("Daisy", "Sweet Princess", "2 Months Old / 1 feet length", "Gender: Female", "22 Miles", R.drawable.cat3),
            PetModel("Fluffy", "Innocent", "3 Months Old / 1 feet length", "Gender: Male", "28 Miles", R.drawable.cat4)
        )

        binding.petListRecycler.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        binding.petListRecycler.adapter = PetListingAdapter(requireContext(), petList)
    }

}