package com.example.taskcy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard2MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2_main)


        val skip2btn:Button=findViewById(R.id.skip2btn)
        val next2btn:Button=findViewById(R.id.next2btn)

        skip2btn.setOnClickListener {
            val intent= Intent(this,Onboard3MainActivity::class.java)
            startActivity(intent)
        }

        next2btn.setOnClickListener {
            val intent= Intent(this,Onboard3MainActivity::class.java)
            startActivity(intent)
        }



    }
}