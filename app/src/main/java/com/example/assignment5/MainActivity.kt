package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button20.setOnClickListener {
            textView.setText("0")
        }
        button5.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "7")
            } else {
                textView.setText(textView.text.toString() + "7")
            }
        }
        button6.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "8")
            } else {
                textView.setText(textView.text.toString() + "8")
            }
        }
        button7.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "9")
            } else {
                textView.setText(textView.text.toString() + "9")
            }
        }
        button9.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "4")
            } else {
                textView.setText(textView.text.toString() + "4")
            }
        }
        button10.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "5")
            } else {
                textView.setText(textView.text.toString() + "5")
            }
        }
        button11.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "6")
            } else {
                textView.setText(textView.text.toString() + "6")
            }
        }
        button13.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "1")
            } else {
                textView.setText(textView.text.toString() + "1")
            }
        }
        button14.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "2")
            } else {
                textView.setText(textView.text.toString() + "2")
            }
        }
        button15.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "3")
            } else {
                textView.setText(textView.text.toString() + "3")
            }
        }
        button17.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString() + "0")
            }
        }
        button2.setOnClickListener {
            if (textView.text == "0" || textView.text.length.toString() == "1") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString().dropLast(1))
            }
        }

    }
}