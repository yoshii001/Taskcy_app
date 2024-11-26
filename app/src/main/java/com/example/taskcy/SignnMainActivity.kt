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
class SignnMainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signn_main)

        //val backSign: Button = findViewById(R.id.backSign)
        val backSign:ImageButton = findViewById(R.id.backSign)
        val signupgo:Button=findViewById(R.id.signupgo)
        val signinbtn:Button=findViewById(R.id.signinbtn)

        backSign.setOnClickListener {
                val intent = Intent(this, GetStratedMainActivity::class.java)
                startActivity(intent)
        }

        signupgo.setOnClickListener {
            val intent = Intent(this, SignUpMainActivity::class.java)
            startActivity(intent)
        }

        signinbtn.setOnClickListener {
            val intent = Intent(this, HomeMainActivity::class.java)
            startActivity(intent)
        }
    }
}