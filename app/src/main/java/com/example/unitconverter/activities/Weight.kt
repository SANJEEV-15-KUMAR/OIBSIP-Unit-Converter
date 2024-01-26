package com.example.unitconverter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.unitconverter.R
import com.example.unitconverter.databinding.ActivitySelectUnitBinding
import com.example.unitconverter.databinding.ActivityWeightBinding

class Weight : AppCompatActivity() {

    private var binding: ActivityWeightBinding? = null

    val weight = arrayOf("Kg","gram","Pounds","Lbs")

    var spinnerval:String? = null
    var spinnerval2:String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        setContentView(binding?.root)

     val arrayAdapter = ArrayAdapter<String>(
         this,android.R.layout.simple_spinner_dropdown_item,weight)

        val arrayAdapter2 = ArrayAdapter<String>(
            this,android.R.layout.simple_spinner_dropdown_item,weight)

      binding?.spinnerWeight1!!.adapter = arrayAdapter
      binding?.spinnerWeight1!!.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
          override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
              spinnerval = weight[position]
          }

          override fun onNothingSelected(p0: AdapterView<*>?) {
              TODO("Not yet implemented")
          }

      }


        binding?.spinnerWeight2!!.adapter = arrayAdapter
        binding?.spinnerWeight2!!.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spinnerval2 = weight[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



        binding?.button?.setOnClickListener {
            if(spinnerval== "Kg" && spinnerval2 =="gm"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*1000
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }


            }
            else if ( spinnerval=="Kg" && spinnerval2 =="Pounds"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*2.20462
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }
            }

            else if ( spinnerval=="Kg" && spinnerval2 =="Lbs"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*2.2046226
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="gram" && spinnerval2 =="Kg"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()/1000
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="gram" && spinnerval2 =="Pounds"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.0022046226
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="gram" && spinnerval2 =="Lbs"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.0022046226218488
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Pounds" && spinnerval2 =="Kg"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.4535923
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Pounds" && spinnerval2 =="gram"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.4535923*1000
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Pounds" && spinnerval2 =="Lbs"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Lbs" && spinnerval2 =="Kg"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.4535923
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Lbs" && spinnerval2 =="gram"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()*0.4535923*1000
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

            else if ( spinnerval=="Lbs" && spinnerval2 =="Pounds"){

                if(binding?.EdWeihght1!!.text.isNotEmpty()){
                    val number = binding?.EdWeihght1!!.text.toString().toFloat()
                    binding?.Tvresult!!.setText(number.toString())
                }
                else{
                    Toast.makeText(this, "please enter  value", Toast.LENGTH_SHORT).show()
                }

            }

        }

    }






}