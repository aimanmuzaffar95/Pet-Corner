package com.example.petcorner.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.petcorner.models.DataRepository
import com.example.petcorner.R
import com.example.petcorner.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        setupPetCategoryFilter()
        setupPetRecycler()
        return binding.root
    }

    private fun setupPetCategoryFilter() {
        binding.petCategoryList = DataRepository.getPetCategories()
    }

    private fun setupPetRecycler() {
        binding.petList = DataRepository.getPetList(requireContext())
    }

}