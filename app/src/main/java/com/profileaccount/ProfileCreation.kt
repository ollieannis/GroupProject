package com.profileaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ProfileCreation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_creation)

        var imageButton = findViewById<ImageButton>(R.id.backbtn)
        imageButton.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)

        }

            var button1 = findViewById<Button>(R.id.signIn)
            button1.setOnClickListener {
                val intent1 = Intent(this, SignIn::class.java)
                startActivity(intent1)


            }
            var button2 = findViewById<Button>(R.id.createAccount)
            button2.setOnClickListener {
                val intent2 = Intent(this, CreateAccount::class.java)
                startActivity(intent2)



            }
        }
    }
