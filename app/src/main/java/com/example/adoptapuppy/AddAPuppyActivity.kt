package com.example.adoptapuppy

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddAPuppyActivity : AppCompatActivity() {
    private val TAG = "AddAPuppyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_a_puppy)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name: EditText = findViewById(R.id.name)
        val age: EditText = findViewById(R.id.age)
        val breed: Spinner = findViewById(R.id.spinner)
        val availableFrom: EditText = findViewById(R.id.available_from)
        val trained: CheckBox = findViewById(R.id.trained)
        val calmness: EditText = findViewById(R.id.slider)
        val camera: Button = findViewById(R.id.camera)
        val add: Button = findViewById(R.id.add_button)

        camera.setOnClickListener {
            Log.d(TAG, "OnCreate: open camera click")
        }
        camera.setOnLongClickListener {
            Log.d(TAG, "OnCreate: open camera long click")
            true
        }
    }
}