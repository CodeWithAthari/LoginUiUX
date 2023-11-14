package com.devatrii.loginuiux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_signup).setOnClickListener {
            startActivity(Intent(this@MainActivity,LoginActivity::class.java))
        }
    }
}

// Allah hafiz see you in the next one hehe :)