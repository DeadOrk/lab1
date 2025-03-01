package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val result: TextView = findViewById(R.id.resultTextView)
        val param1: EditText = findViewById(R.id.firstInput)
        val param2: EditText = findViewById(R.id.secondInput)
        val button: Button = findViewById(R.id.calculateButton)
        val whichFormulaUsed: RadioGroup = findViewById(R.id.formulaSwitch)

        button.setOnClickListener {

            if (whichFormulaUsed.checkedRadioButtonId == R.id.firstFormula)
            {
                result.text = (param1.text.toString().toDouble() * param2.text.toString().toDouble()).toString()
            }
            else
            {
                result.text = (param1.text.toString().toDouble() * param2.text.toString().toDouble() / 2).toString()
            }

            //result.text = (param1.text.toString().toDouble() * param2.text.toString().toDouble()).toString()
            //result.visibility = View.VISIBLE
        }


    }
}