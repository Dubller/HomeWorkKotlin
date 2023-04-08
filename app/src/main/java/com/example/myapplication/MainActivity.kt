package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnAct: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAct = findViewById(R.id.btnAct)

        btnAct.setOnClickListener {
            startActivity(Intent(this, SecondAct::class.java))
        setColl()
        }

    }

    fun setColl() {
        val num = listOf("One", "Two", "Three", "Four") //неизменяемая коллекция
        //num.add("Five")
        val num1 = mutableListOf("One", "Two", "Three", "Four") //изменяемая коллекция
        num1.add("five")
        num1.removeAt(2)

        Log.d("TEST_ANDROID", "${num}")
        Log.d("TEST_ANDROID", "${num.size}")
        Log.d("TEST_ANDROID", "${num1}")
        Log.d("TEST_ANDROID", "${num1.add("Ten")}")
        Log.d("TEST_ANDROID", "${num1}")

        Log.d("TEST_ANDROID", "-------------------------------")

        val num3 = mapOf("Key1" to 1, "Key2" to 2, "Ket3" to 3)
        val num4 = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3)
        Log.d("TEST_ANDROID", "${num3.size}")
        Log.d("TEST_ANDROID", "${num4}")
        Log.d("TEST_ANDROID", "${num4.put("key4", 4)}")
        Log.d("TEST_ANDROID", "${num4}")

        Log.d("TEST_ANDROID", "-------------------------------")

        val num5 = setOf("One", "Two", "Three")
        val num6 = mutableSetOf("One", "Two", "Three")
        Log.d("TEST_ANDROID", "${num5.size}")
        Log.d("TEST_ANDROID", "${num6.add("Four")}")
        Log.d("TEST_ANDROID", "${num6}")


    }
}