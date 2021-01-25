package com.example.petcorner.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.example.petcorner.R
import com.example.petcorner.databinding.ActivityGettingStartedBinding

class GettingStartedActivity : AppCompatActivity() {

    lateinit var binding: ActivityGettingStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getting_started)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.lets_go_btn -> {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}