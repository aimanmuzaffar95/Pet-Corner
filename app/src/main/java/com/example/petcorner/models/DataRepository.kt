package com.example.petcorner.models

import android.content.Context
import com.example.petcorner.R


object DataRepository {

    const val MALE = "Male"
    const val FEMALE = "Female"

    fun getPetCategories(): ArrayList<PetCategory> {
        return arrayListOf(
                PetCategory("Cats", true),
                PetCategory("Dogs"),
                PetCategory("Birds"),
                PetCategory("Mice"),
                PetCategory("Rabbits"),
                PetCategory("Bunnies"),
                PetCategory("Parrots"),
        )
    }

    fun getPetList(context: Context): ArrayList<PetModel> {
        return arrayListOf(
                PetModel(petName = "Lilly", petShortDescription = "Cute Cat", petDescription = context.getString(R.string.sample_pet_desc),
                        petAge = 6, petGender = FEMALE, petLength = 6, petColor = "White", distance = "10 Miles", image = R.drawable.cat1),

                PetModel(petName = "Furry", petShortDescription = "Cute White Gray Cat", petDescription = context.getString(R.string.sample_pet_desc),
                        petAge = 8, petGender = FEMALE, petLength = 3, petColor = "White", distance = "18 Miles", image = R.drawable.cat2),

                PetModel(petName = "Daisy", petShortDescription = "Sweet Princess", petDescription = context.getString(R.string.sample_pet_desc),
                        petAge = 4, petGender = FEMALE, petLength = 2, petColor = "White", distance = "22 Miles", image = R.drawable.cat3),

                PetModel(petName = "Fluffy", petShortDescription = "Innocent Cat", petDescription = context.getString(R.string.sample_pet_desc),
                        petAge = 4, petGender = FEMALE, petLength = 5, petColor = "White", distance = "24 Miles", image = R.drawable.cat4),
        )
    }
}