package com.example.taskcy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_main)

        val signupbtn:Button=findViewById(R.id.signupbtn)
        val backSign:ImageButton=findViewById(R.id.backSign)
        val signupgo:Button=findViewById(R.id.signupgo)

        signupbtn.setOnClickListener {

            val intent = Intent(this, SignnMainActivity::class.java)
            startActivity(intent)
        }
        backSign.setOnClickListener {
            val intent = Intent(this, SignnMainActivity::class.java)
            startActivity(intent)
        }

        signupgo.setOnClickListener {
            val intent = Intent(this, SignnMainActivity::class.java)
            startActivity(intent)
        }


    }
}