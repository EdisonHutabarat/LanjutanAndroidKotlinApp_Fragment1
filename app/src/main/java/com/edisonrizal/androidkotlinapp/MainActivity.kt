package com.edisonrizal.androidkotlinapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

//import android.widget.Button
//import android.widget.TextView
import com.edisonrizal.androidkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    private lateinit var tvCounter: TextView
//    private lateinit var btnAddNumber: Button
//    private lateinit var btnResetNumber: Button
//    private lateinit var btnSubstractNumber: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //layout binding with library view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        //layout binding
//        setContentView(R.layout.activity_main)
//
//        //view binding
//        tvCounter = findViewById(R.id.tvCounter)
//        btnAddNumber = findViewById(R.id.btnAddNumber)
//        btnResetNumber = findViewById(R.id.btnResetNumber)
//        btnSubstractNumber = findViewById(R.id.btnSubstractNumber)

        binding.tvCounter.text = "1"
    }
    //fungsi untuk menambah
    fun addNumber(v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }

    fun resetNumber(v: View){
        binding.tvCounter.text = "0"
    }

    fun substractNumber(v: View) {
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        binding.tvCounter.text = nextVal.toString()
    }
}