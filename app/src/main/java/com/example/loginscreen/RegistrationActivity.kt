package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
//        Declaretion
        val btnloginR = findViewById<TextView>(R.id.btnloginR)
        val registration_in= findViewById<ImageView>(R.id.front_registration)

//        Animation
        val car_in_reg= AnimationUtils.loadAnimation(this, R.anim.ragestration_car_in)


        registration_in.startAnimation(car_in_reg)


        btnloginR.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right )


        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right )
    }


}