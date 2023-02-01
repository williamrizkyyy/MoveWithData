package com.example.ukl

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithData : AppCompatActivity() {

            private lateinit var Hello: TextView
            private lateinit var Pass: TextView
            private var email: String? = null
            private var pass: String? = null

            private val EMAIL = "HOOH"
            private val PASS = "123"
            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_move_with_data)

                Hello = findViewById(R.id.Tampil)
                Pass = findViewById(R.id.ShowPass)

                val extras = intent.extras
                email = extras?.getString(EMAIL)
                pass = extras?.getString(PASS)
                Hello.text = "Email: $email"
                Hello.text = "Pass: $pass"


            }
        }

