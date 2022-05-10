package com.afterclass.counting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel: NumberViewModel
    private lateinit var number:TextView
    private lateinit var word:TextView
    private lateinit var plusButton:Button
    private lateinit var minusButton:Button
    private lateinit var reset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel=ViewModelProvider(this).get(NumberViewModel::class.java)
        number=findViewById(R.id.number)
        word=findViewById(R.id.word)
        plusButton=findViewById(R.id.right)
        minusButton=findViewById(R.id.left)
        reset=findViewById(R.id.reset)
        number.setText(myViewModel.number.toString())


        plusButton.setOnClickListener {
            myViewModel.plus()
            number.setText(myViewModel.number.toString())
            word.setText(myViewModel.word.toString())

        }

        minusButton.setOnClickListener {
            myViewModel.minus()
            number.setText(myViewModel.number.toString())
            word.setText(myViewModel.word.toString())

        }
        reset.setOnClickListener {
            myViewModel.number=0
            myViewModel.word="Zero"
            number.setText(myViewModel.number.toString())
            word.setText(myViewModel.word.toString())

        }


    }

}