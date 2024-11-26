package com.example.taskcy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChatMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val chatBack: ImageButton =findViewById(R.id.chatBack)
        val profile: ImageButton = findViewById(R.id.profile)
        val add: ImageButton = findViewById(R.id.add)
        val home: ImageButton = findViewById(R.id.home)
        val project:ImageButton= findViewById(R.id.project)

        project.setOnClickListener {
            val intent= Intent(this,ProjectMainActivity::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent= Intent(this,HomeMainActivity::class.java)
            startActivity(intent)
        }
       chatBack.setOnClickListener {
            val intent= Intent(this,HomeMainActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent= Intent(this,ProfileMainActivity::class.java)
            startActivity(intent)
        }
        add.setOnClickListener {
            val intent= Intent(this,AddTaskMainActivity::class.java)
            startActivity(intent)
        }

    }
}