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

class AddTaskMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_task_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val addtaskback: ImageButton =findViewById(R.id.addtaskback)
        val message: ImageButton = findViewById(R.id.message)
        val profile: ImageButton = findViewById(R.id.profile)
        val project: ImageButton = findViewById(R.id.project)
        val home: ImageButton = findViewById(R.id.home)
        val save_button: Button =findViewById(R.id.save_button)

        message.setOnClickListener {
            val intent= Intent(this,ChatMainActivity::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent= Intent(this,HomeMainActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent= Intent(this,ProfileMainActivity::class.java)
            startActivity(intent)
        }
        project.setOnClickListener {
            val intent= Intent(this,ProjectMainActivity::class.java)
            startActivity(intent)
        }
        addtaskback.setOnClickListener {
            val intent= Intent(this,HomeMainActivity::class.java)
            startActivity(intent)
        }
        save_button.setOnClickListener {
            val intent= Intent(this,ProjectspageMainActivity::class.java)
            startActivity(intent)
        }
    }
}