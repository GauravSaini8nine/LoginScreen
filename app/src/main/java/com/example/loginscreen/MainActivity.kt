package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Declaration
        val btnregisterL = findViewById<TextView>(R.id.btnregisterL)
        val login_in= findViewById<ImageView>(R.id.front_login)



//        Animation
        val car_in_login=AnimationUtils.loadAnimation(this, R.anim.login_car_in)
//        val fade_out=AnimationUtils.loadAnimation(this, R.anim.registration_car_in)

        login_in.startAnimation(car_in_login)



        btnregisterL.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left )

        }



    }
//    override fun onBackPressed() {
//        super.onBackPressed()
//        finish()
//    }
}