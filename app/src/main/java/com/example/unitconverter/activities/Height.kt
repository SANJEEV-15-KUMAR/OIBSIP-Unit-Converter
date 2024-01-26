package com.example.unitconverter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.unitconverter.R
import com.example.unitconverter.databinding.ActivityHeightBinding

class Height : AppCompatActivity() {

    private var binding:ActivityHeightBinding? = null


    val Height = arrayOf("cm","meter","inch","feet")

    var spinnerval:String? = null
    var spinnerval2:String? = null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeightBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        val arrayAdapter = ArrayAdapter<String>(
            this,android.R.layout.simple_spinner_dropdown_item,Height)

        binding?.spinnerWeight1!!.adapter = arrayAdapter
        binding?.spinnerWeight1!!.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spinnerval = Height[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        binding?.spinnerWeight2!!.adapter = arrayAdapter
        binding?.spinnerWeight2!!.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spinnerval2 = Height[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        binding?.button!!.setOnClickListener {

            if(spinnerval== "cm" && spinnerval2 =="meter"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.01
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="cm" && spinnerval2 =="inch"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.3937007874
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="cm" && spinnerval2 =="feet"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.032808399
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="meter" && spinnerval2 =="cm"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*100
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="meter" && spinnerval2 =="inch"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*39.37007874
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="meter" && spinnerval2 =="feet"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*3.280839895
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="inch" && spinnerval2 =="cm"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*2.54
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="inch" && spinnerval2 =="meter"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.0254
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="inch" && spinnerval2 =="feet"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.0833333333
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="feet" && spinnerval2 =="cm"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*30.48
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="feet" && spinnerval2 =="meter"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.3048
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="feet" && spinnerval2 =="inch"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*12
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }


        }

    }
}