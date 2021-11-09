package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var androidIsGreen = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeImage(view: android.view.View) {
        val image = findViewById<ImageView>(R.id.imageView)

        if(androidIsGreen)
        {
            image.setImageResource(R.drawable.android_black)
            androidIsGreen = false;
        }
        else
        {
            image.setImageResource(R.drawable.android_green)
            androidIsGreen = true;
        }
    }
}