package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_shoe_detail.*

class ShoeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe_detail)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("sendData")
        name.text = "Employee Name: ${newEmployee?.name}"
        gender.text = "Gender: ${newEmployee?.gender}"
        email.text = "E-Mail : ${newEmployee?.mail}"
        salary.text = "Salary: ${newEmployee?.salary} Baht"
    }
    fun onClickClose(view: View){
        finish()
    }
}

