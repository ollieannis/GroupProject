package com.profileaccount

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.core.content.ContextCompat.startActivity

class CreateAccount : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var imageButton = findViewById<ImageButton>(R.id.backbtn)
        imageButton.setOnClickListener {
            val intent = Intent(this, ProfileCreation::class.java)
            startActivity(intent)



            handler = DatabaseHelper(this)

            val fname = findViewById<EditText>(R.id.fname)
            val lname = findViewById<EditText>(R.id.lname)
            val email = findViewById<EditText>(R.id.email)
            val password = findViewById<EditText>(R.id.password)

            val accountCreated = findViewById<Button>(R.id.accountCreated)
            accountCreated.setOnClickListener {
                handler.insertUserData(
                        fname.text.toString(),
                        lname.text.toString(),
                        email.text.toString(),
                        password.text.toString()
                )
            }
        }
    }
}

