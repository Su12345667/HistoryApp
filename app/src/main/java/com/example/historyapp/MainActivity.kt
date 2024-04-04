package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exitBtn = findViewById<Button>(R.id.exitBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val generateBtn = findViewById<Button>(R.id.generateBtn)

        exitBtn.setOnClickListener {
            exitProcess(1)
        }
        generateBtn.setOnClickListener {
        }

    }
}
