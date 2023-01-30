package com.example.myapplication

import android.icu.text.ListFormatter.Width
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var Height = 60
    private var Width = 60
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sqrText: TextView = findViewById(R.id.SquareText)
        val increaseH:Button = findViewById(R.id.increaseH)
        val increaseW:Button = findViewById(R.id.widthD)
        val decreaseH:Button = findViewById(R.id.decreaseH)
        val decreaseW:Button = findViewById(R.id.decreaseW)
        val rectangle:Button = findViewById(R.id.Rect)
        fun square()
        {
            if(Height==Width)
            {
                sqrText.text = "It'S Perfect Square"
            }
            else
            {
                sqrText.text = ""
            }
        }
        increaseH.setOnClickListener {
            increase_H()
            rectangle.layoutParams.height= Height
            rectangle.requestLayout()
            rectangle.text = " Area = ${(Height*Width/100)}, H:${Height/10}, W:${Width/10}".toString()
            square()
        }
        increaseW.setOnClickListener {
            increase_W()
            rectangle.layoutParams.width= Width
            rectangle.requestLayout()
            rectangle.text = " Area = ${(Height*Width/100)}, H:${Height/10}, W:${Width/10} ".toString()
            square()
        }
        decreaseH.setOnClickListener {
            decrease_H()
            rectangle.layoutParams.height= Height
            rectangle.requestLayout()
            rectangle.text = " Area = ${(Height*Width/100)}, H:${Height/10}, W:${Width/10}".toString()
            square()
        }
        decreaseW.setOnClickListener {
            decrease_W()
            rectangle.layoutParams.width= Width
            rectangle.requestLayout()
            rectangle.text = " Area = ${(Height*Width/100)}, H:${Height/10}, W:${Width/10} ".toString()
            square()
        }
    }
    fun increase_H()
    {
        Height+=10
    }
    fun increase_W(){
        Width+=10
    }
    fun decrease_H()
    {
        if(Height-10 >=0){
            Height-=10
        }
        else
        {
            Toast.makeText(baseContext, "Height Cannot be negative", Toast.LENGTH_SHORT).show()
        }
    }
    fun decrease_W(){
        if(Width-10 >=0){
            Width-=10
        }
        else
        {
            Toast.makeText(baseContext, "Width Cannot be negative", Toast.LENGTH_SHORT).show()
        }
    }
}