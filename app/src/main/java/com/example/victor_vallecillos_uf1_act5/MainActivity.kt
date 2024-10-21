package com.example.victor_vallecillos_uf1_act5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.optionsButton).setOnClickListener {
            val intent = Intent(this, OptionsActivity::class.java)
            startActivity(intent)
        }
    }
}