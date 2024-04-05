package com.example.thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Range
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exitBtn = findViewById<Button>(R.id.exitBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val generateBtn = findViewById<Button>(R.id.generateBtn)
        val txt = findViewById<TextView>(R.id.display)
        val numTxt = findViewById<EditText>(R.id.editTextNumber)
        val ages = listOf(22, 32, 34, 78, 63, 41, 55, 82, 98, 84,95,56)
        val names = listOf("Black Dahlia", "Brittany Murphy", "Jeffrey Dahmer",
            "Andrew Jackson", "Donna Summer", "Kobe Bryant",
            "Emily Dickinson", "Neil Armstrong", "Pierre Cardin", "Sir Isaac Newton",
            "Nelson Mandela","Adolf Hitler")

        resetBtn.setOnClickListener {
            txt.text = ""
            numTxt.setText("")
        }

        exitBtn.setOnClickListener {
            finish() // Exit/End the activity
        }

        generateBtn.setOnClickListener {
            val age = numTxt.text.toString()
            if (age.isNotEmpty()) {
                val age = age.toInt()
                if (age in 20..100) {
                    if (ages.contains(age)) {
                        val nameOf = ages.indexOf(age)
                        txt.text = "Your age matches with ${names[nameOf]}"
                    } else {
                        txt.text = "Your age does not match with any historical figure in the  current" +
                                "list"
                    }
                } else {
                    txt.text = "Enter a valid number between 20 to 100"
                }
            } else {
                txt.text = "Please enter your age"
            }
        }


    }

}



