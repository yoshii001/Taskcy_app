package com.example.taskcy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard3MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3_main)

        val skip3btn:Button=findViewById(R.id.skip3btn)
        val next3btn:Button=findViewById(R.id.next3btn)

        skip3btn.setOnClickListener {
            val intent= Intent(this,GetStratedMainActivity::class.java)
            startActivity(intent)
        }
        next3btn.setOnClickListener {
            val intent= Intent(this,GetStratedMainActivity::class.java)
            startActivity(intent)
        }
    }
}