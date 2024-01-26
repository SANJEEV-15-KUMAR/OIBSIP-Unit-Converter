package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unitconverter.activities.Height
import com.example.unitconverter.activities.Weight
import com.example.unitconverter.databinding.ActivitySelectUnitBinding

class SelectUnit : AppCompatActivity() {

    private var binding:ActivitySelectUnitBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectUnitBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnSelectWeight!!.setOnClickListener{
            val intent = Intent(this,Weight::class.java)
            startActivity(intent)
        }

        binding?.btnSelectHeight!!.setOnClickListener{
            val intent = Intent(this,Height::class.java)
            startActivity(intent)
        }

    }
}