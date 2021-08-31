package com.example.astro_zoneapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class HomeActivity : AppCompatActivity() , DatePickerDialog.OnDateSetListener{

    lateinit var result:EditText;
    lateinit var name:EditText;
    lateinit var dob_button:Button;
    var day: Int = 0;
    var month:Int=0;
    var year:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        name=findViewById<EditText>(R.id.name);
        dob_button=findViewById<Button>(R.id.dob_button);
        result=findViewById<EditText>(R.id.result);

        dob_button.setOnClickListener{

            //show the date picker
            var cal=Calendar.getInstance();
            year=cal.get(Calendar.YEAR);
            month=cal.get(Calendar.MONTH);
            day=cal.get(Calendar.DAY_OF_MONTH);

            var datePickerDialog= DatePickerDialog(this,this,year,month,day);
            datePickerDialog.show();
        }

    }

    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

        //return the selected date

        result.setText("Hi "+ name.text.toString() + "Your Zodiac sign is :" + ZodiacSign(day,month))


    }

    private fun ZodiacSign(day:Int,month:Int):String
    {
        var zodiacSign="";

        if(month==0)
        {
            if(day<20)
            { zodiacSign="Capricon"; }
            else
            { zodiacSign="Aquarius"; }
        }


        if(month==1)
        {
            if(day<19)
            { zodiacSign="Aquarius"; }
            else
            { zodiacSign="Pisces"; }
        }

        if(month===2)
        {
            if(day<21)
            { zodiacSign="Pisces"; }
            else
            { zodiacSign="Aries"; }
        }

        if(month==3)
        {
            if(day<20)
            { zodiacSign="Aries"; }
            else
            { zodiacSign="Taurus"; }
        }

        if(month==4)
        {
            if(day<21)
            { zodiacSign="Taurus"; }
            else
            { zodiacSign="Gemini"; }
        }

        if(month==5)
        {
            if(day<22)
            { zodiacSign="Gemini"; }
            else
            { zodiacSign="Cancer"; }
        }

        if(month==6)
        {
            if(day<23)
            { zodiacSign="Cancer"; }
            else
            { zodiacSign="Leo"; }
        }

        if(month==7)
        {
            if(day<23)
            { zodiacSign="Leo"; }
            else
            { zodiacSign="Virgo"; }
        }

        if(month==8)
        {
            if(day<23)
            { zodiacSign="Virgo"; }
            else
            { zodiacSign="Libra"; }
        }

        if(month==9)
        {
            if(day<24)
            { zodiacSign="Libra"; }
            else
            { zodiacSign="Scorpius"; }
        }

        if(month==10)
        {
            if(day<22)
            { zodiacSign="Scorpius"; }
            else
            { zodiacSign="Sagittarius"; }
        }

        if(month==11)
        {
            if(day<22)
            { zodiacSign="Sagittarius"; }
            else
            { zodiacSign="Capricornus"; }
        }
        return zodiacSign;
    }


}