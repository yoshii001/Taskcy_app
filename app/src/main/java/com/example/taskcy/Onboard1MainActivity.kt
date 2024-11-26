package com.example.taskcy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard1MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1_main)

        val skipbtn:Button=findViewById(R.id.skipbtn)
        val next1btn:Button=findViewById(R.id.next1btn)

        skipbtn.setOnClickListener {
            val intent= Intent(this,Onboard2MainActivity::class.java)
            startActivity(intent)

        }
        next1btn.setOnClickListener {
            val intent= Intent(this,Onboard2MainActivity::class.java)
            startActivity(intent)
        }
    }
}