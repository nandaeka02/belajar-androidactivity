package com.example.belajarandroidactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnbacksecond = findViewById<Button>(R.id.btnBackSecond)
        val btnnextthird = findViewById<Button>(R.id.btnNextThird)
        btnbacksecond.setOnClickListener {
            finish()
        }
        btnnextthird.setOnClickListener {
            Intent(this, ThirdActivity()::class.java).also {
                startActivity(it)
            }
        }
    }
}