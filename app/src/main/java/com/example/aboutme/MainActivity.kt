package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone :Button = findViewById(R.id.Confirmbtn)
        val inputNickname :TextView =  findViewById(R.id.Nameinput)
        val outputNickname :TextView = findViewById(R.id.Displaytxt)

        btnDone.setOnClickListener {
            val inputValue = inputNickname.text
            outputNickname.text = inputValue
            outputNickname.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            inputNickname.visibility = View.GONE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)

        }

        outputNickname.setOnClickListener{
            outputNickname.visibility = View.GONE
            btnDone.visibility = View.VISIBLE
            inputNickname.visibility = View.VISIBLE

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(inputNickname, 0)
        }

    }



}