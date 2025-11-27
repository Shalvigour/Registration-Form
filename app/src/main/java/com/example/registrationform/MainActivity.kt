package com.example.registrationform

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var edit1:EditText=findViewById(R.id.blank3)
        var edit2:EditText=findViewById(R.id.blank4)
        var btn:Button=findViewById(R.id.btn)
        var text:TextView=findViewById(R.id.text)

        btn.setOnClickListener{
            var num1:Int=edit1.text.toString().toInt()
            var num2:Int=edit2.text.toString().toInt()
            if(0.75*num1<=num2)
                text.setText("Eligible")
            else
                text.setText("Not Eligible")
        }


    }
}