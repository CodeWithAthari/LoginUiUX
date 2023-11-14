package com.devatrii.loginuiux

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            showSnackbar("Logged in")
        }
    }

    private fun showSnackbar(message: String) {
        val snackbar = Snackbar.make(findViewById(R.id.rootConstraint), message, Snackbar.LENGTH_SHORT)
        snackbar.show()
    }
}