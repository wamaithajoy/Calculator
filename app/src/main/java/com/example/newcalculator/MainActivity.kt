package com.example.newcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnumber1:EditText
    lateinit var etnumber2:EditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmodulus:Button
    lateinit var btnmultiply:Button
    lateinit var tvresult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnumber1=findViewById(R.id.etnumber1)
        etnumber2=findViewById(R.id.etnumber2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmodulus=findViewById(R.id.btnmodulus)
        btnmultiply=findViewById(R.id.btnmultiply)
        tvresult=findViewById(R.id.tvresult)
        btnadd.setOnClickListener {
            var number1=etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            addition(number1, number2)
        }
     btnsubtract.setOnClickListener {
         var number1=etnumber1.text.toString().toInt()
         var number2=etnumber2.text.toString().toInt()
         subtraction(number1, number2)
     }
        btnmodulus.setOnClickListener {
            var number1=etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            modulus(number1, number2)
        }
        btnmultiply.setOnClickListener {
            var number1=etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
          multiplication(number1, number2)
        }
    }
    fun addition(number1:Int,number2:Int){
      var sum=number1+number2
      tvresult.text=sum.toString()
    }
    fun subtraction(number1: Int,number2: Int){
      var minus=number1-number2
      tvresult.text=minus.toString()
    }
   fun modulus(number1:Int,number2:Int){
      var modulus=number1%number2
       tvresult.text=modulus.toString()
   }
   fun multiplication(number1:Int,number2:Int){
      var modulus=number1*number2
       tvresult.text=modulus.toString()
   }
}