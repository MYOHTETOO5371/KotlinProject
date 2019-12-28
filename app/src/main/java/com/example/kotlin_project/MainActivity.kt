package com.example.kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1=findViewById<EditText>(R.id.text1)
        val text2=findViewById<EditText>(R.id.text2)

        val btnsum=findViewById<Button>(R.id.btn_sum)
        val btnsub=findViewById<Button>(R.id.btn_sub)
        val btndiv=findViewById<Button>(R.id.btn_div)
        val btnmult=findViewById<Button>(R.id.btn_mult)

        val text_result=findViewById<TextView>(R.id.text_result)
        //val text_result:TextView=findViewById(R.id.text_result)

        btnsum.setOnClickListener {
            var numOne:Int =text1.text.toString().toInt()
            //convert to integer
            var numTwo:Int=text2.text.toString().toInt()
            var result=numOne+numTwo
            text_result.text="Sum ="+result.toString()
            text_result.isVisible
        }
        btnsub.setOnClickListener {
            var numOne:Int =text1.text.toString().toInt()
            //convert to integer
            var numTwo:Int=text2.text.toString().toInt()
            var result=numOne-numTwo
            text_result.text="Sub ="+result.toString()
            text_result.isVisible
        }
        btndiv.setOnClickListener {
            var numOne:Int=text1.text.toString().toInt()
            //convert to integer
            var numTwo:Int=text2.text.toString().toInt()
            var result1=(numOne/numTwo)
            //var result2=((numOne%numTwo)/10).toFloat()
            //var result3=result1+result2
            text_result.text="Div ="+result1.toString()
            text_result.isVisible
        }
        btnmult.setOnClickListener {
            var numOne:Int =text1.text.toString().toInt()
            //convert to integer
            var numTwo:Int=text2.text.toString().toInt()
            var result=numOne*numTwo
            text_result.text="Mult ="+result.toString()
            text_result.isVisible
        }


    }
}




