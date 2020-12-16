package com.profileaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class SignIn : AppCompatActivity() {
    lateinit var handler:DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var ImageButton = findViewById<ImageButton>(R.id.backbtn)
        ImageButton.setOnClickListener {
            val intent = Intent(this, ProfileCreation::class.java)
            startActivity(intent)

        }
        handler = DatabaseHelper(this)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val signedIn = findViewById<Button>(R.id.signedIn)
        signedIn.setOnClickListener{
            if (handler.userPresent(email.text.toString(), password.text.toString()))
                Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
        }
    }
}