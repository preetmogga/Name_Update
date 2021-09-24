package com.preet.test


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


   val tv = findViewById<TextView>(R.id.textview)
        val edit = findViewById<EditText>(R.id.edittext)
        val bt = findViewById<Button>(R.id.button)
        bt.setOnClickListener {
            tv.text = edit.text.toString()
        }

        var sp1 = findViewById<Spinner>(R.id.spinner)
        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var pos = sp1.selectedItemPosition
                when(pos){
                    1 -> tv.setTextColor(Color.RED)
                    2 -> tv.setTextColor(Color.BLACK)
                    3 -> tv.setTextColor(Color.BLUE)
                    4 -> tv.setTextColor(Color.GREEN)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        var sp2 = findViewById<Spinner>(R.id.spinners)
        sp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var sp = sp2.selectedItemPosition
                when(sp){
                    1 -> tv.textSize = 20f
                    2 -> tv.textSize = 25f
                    3 -> tv.textSize = 30f
                    4 -> tv.textSize = 35f



                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



    }
}