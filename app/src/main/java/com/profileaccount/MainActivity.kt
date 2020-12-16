package com.profileaccount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ImageButton = findViewById<ImageButton>(R.id.backbtn3)
        ImageButton.setOnClickListener {
            val intent = Intent(this, ProfileCreation::class.java)
            startActivity(intent)

        }

        var button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            val intent = Intent(this, ProfileCreation::class.java)
            startActivity(intent)


        }


        }

}