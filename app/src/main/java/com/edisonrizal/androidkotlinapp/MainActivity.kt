package com.edisonrizal.androidkotlinapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnResetNumber: Button
    private lateinit var btnSubstractNumber: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //layout binding
        setContentView(R.layout.activity_main)

        //view binding
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber)
        btnSubstractNumber = findViewById(R.id.btnSubstractNumber)

        tvCounter.text = "1"
    }
    //fungsi untuk menambah
    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

    fun resetNumber(v: View){
        tvCounter.text = "0"
    }

    fun substractNumber(v: View) {
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }
}