package com.example.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener{
            var count = main.txtCount.text.toString().toInt()
            main.txtCount.text = "${++count}"
        }

        main.btnSub.setOnClickListener{
            var count = main.txtCount.text.toString().toInt()
            if(count != 0){
                main.txtCount.text = "${--count}"
            }
        }

        main.btnReset.setOnClickListener{
            var count = main.txtCount.text.toString().toInt()
            count = 0
            main.txtCount.text = "$count"
        }

    }
}