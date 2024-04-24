package com.st10440057.calculatoreg2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var etNum1 : EditText? = findViewById(R.id.etNum1)
    var etNum2 : EditText? = findViewById(R.id.etNum2)
    var tvDisplay: TextView? = findViewById(R.id.tvDisplay)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}
        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{subtract()}
        val btnMalt = findViewById<Button>(R.id.btnMult)
        btnMalt.setOnClickListener{multiply()}
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{divide()}
        val btnRoot = findViewById<Button>(R.id.btnSQRT)
        btnRoot.setOnClickListener{root()}
        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener{Pow()}

    }
    private fun validateInput(n1:String,n2:String): Boolean {
    if(n1.isNullOrEmpty() || n2.isNullOrEmpty()){
        return false
    }else{
        return true
    }


    }//Valudate Input



    private fun add(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()!!.toInt()
        var fltAnswer = intNum1 + intNum2

        tvDisplay?.text = fltAnswer.toString()


    }//add
    private fun subtract(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()!!.toInt()
        var fltAnswer = intNum1 - intNum2

        tvDisplay?.text = fltAnswer.toString()

    }//subtract
    private fun multiply(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()!!.toInt()
        var fltAnswer = intNum1 * intNum2

        tvDisplay?.text = fltAnswer.toString()
    }//multiply
    private fun divide(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()!!.toInt()
        var fltAnswer = intNum1 / intNum2

        if(intNum2 == 0 || intNum1 == 0){
            tvDisplay?.text = "Cannot divide by 0"
        }else {
            tvDisplay?.text = fltAnswer.toString()
        }

    }//divide
    private fun Pow(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()?.toInt()
        var fltAnswer = 1
    /*for(i in 1..intNum2!!){
        fltAnswer = fltAnswer*intNum1

    }*/
       

       tvDisplay?.text = fltAnswer.toString()


    }//pow
    private fun root(){
        var intNum1 = etNum1.toString()!!.toInt()
        var intNum2 = etNum2?.toString()?.toInt()
        var fltAnswer = 1
        for(i in 1..intNum2!!){
            fltAnswer = fltAnswer/intNum1

        }

        tvDisplay?.text = fltAnswer.toString()

    }//root


}