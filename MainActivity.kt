package com.example.ukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var btnLogin: Button

    private val EMAIL = "HOOH"
    private val PASS = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById<EditText>(R.id.etUsername)
        password = findViewById<EditText>(R.id.etPassword)
        btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            try {
                val Email = username.text.toString()
                val Pass = password.text.toString()
                if (Email.isNotBlank() && Pass.isNotBlank()) {
                    val i = Intent(this, MoveWithData::class.java)
                    i.putExtra(EMAIL, Email)
                    i.putExtra(PASS, Pass)
                    startActivity(i)
                } else {
                    Toast.makeText(applicationContext, "PLEASE INPUT EMAIL", Toast.LENGTH_SHORT)
                        .show()
                }
            } catch (e: Exception) {

                e.printStackTrace()
                Toast.makeText(applicationContext, "ERROR, TRY AGAIN", Toast.LENGTH_SHORT).show()

            }
        }

    }
}