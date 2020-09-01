package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun showdata(v: View) {

            var radioGroup: Int = radioGroup.checkedRadioButtonId
            var radioButton: RadioButton = findViewById(radioGroup)
            val intent = Intent(this, ShoeDetail::class.java)
            intent.putExtra(
                "sendData",
                Employee(
                    edit_name.text.toString(),
                    radioButton.text.toString(),
                    edit_mail.text.toString(),
                    edit_saraly.text.toString().toInt()
                )
            )
            startActivity(intent)

        }

        fun reset(v: View) {
            edit_name.text.clear()
            edit_mail.text.clear()
            radioGroup.clearCheck()
            edit_saraly.text.clear()
        }

    }

