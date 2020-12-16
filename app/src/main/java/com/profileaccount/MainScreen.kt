package com.profileaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        var button = findViewById<Button>(R.id.profilecreationbtn)
        button.setOnClickListener {
            val intent = Intent(this, ProfileCreation::class.java)
            startActivity(intent)

        }
    }
}