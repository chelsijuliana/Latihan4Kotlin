package com.chelsi.latihan4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText
    lateinit var login_Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        emailInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)
        login_Btn = findViewById(R.id.login_btn)

        login_Btn.setOnClickListener{

            val name = usernameInput.text.toString()
            val username = usernameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email == "chelsijuliana10@gmail.com" && password == "10072005") {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Email atau Password Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}