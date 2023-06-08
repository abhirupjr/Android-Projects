package com.example.simplecalculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.ETI1
import kotlinx.android.synthetic.main.activity_main.ETI22
import kotlinx.android.synthetic.main.activity_main.btnDivide
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMultiply
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.tVResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnPlus.setOnClickListener{
            val input1=ETI1.text.toString().toInt()
            val input2=ETI22.text.toString().toInt()
            tVResult.text=(input1+input2).toString()
        }
        btnMinus.setOnClickListener{
            val input1=ETI1.text.toString().toInt()
            val input2=ETI22.text.toString().toInt()
            tVResult.text=(input1-input2).toString()
        }
        btnDivide.setOnClickListener{
            val input1=ETI1.text.toString().toFloat()
            val input2=ETI22.text.toString().toFloat()
            tVResult.text=(input1/input2).toString()
        }
        btnMultiply.setOnClickListener{
            val input1=ETI1.text.toString().toInt()
            val input2=ETI22.text.toString().toInt()
            tVResult.text=(input1*input2).toString()
        }

    }
}