package com.example.taskcy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GetStratedMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_strated_main)

        val getstartbtn: Button = findViewById(R.id.startbtn)
        getstartbtn.setOnClickListener {
            val intent = Intent(this, SignnMainActivity::class.java)
            startActivity(intent)
        }
    }
}



