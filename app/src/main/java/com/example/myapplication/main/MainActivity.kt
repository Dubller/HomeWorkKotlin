package com.example.myapplication.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R
import com.example.myapplication.fragment.SecondActivity

class MainActivity : AppCompatActivity() {


    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etUsername = findViewById(R.id.etUssername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val usetname = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim().length

            if (password < 8) {
                etPassword.error = "PASS < 8"
                return@setOnClickListener
            } else {
                btnLogin.setOnClickListener {
                    val m_intent= Intent(this@MainActivity, SecondActivity::class.java)
                    startActivity(m_intent)
                    onStop()
                }
            }
        }

    }

}