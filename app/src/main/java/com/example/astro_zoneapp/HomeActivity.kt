package com.example.astro_zoneapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageView
import java.util.*

class HomeActivity : AppCompatActivity() , DatePickerDialog.OnDateSetListener{

    lateinit var result:EditText;
    lateinit var name:EditText;
    lateinit var dob_button:Button;
    var day: Int = 0;
    var month:Int=0;
    var year:Int=0;
    lateinit var zodiacSign_Image:ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        name=findViewById<EditText>(R.id.name);
        dob_button=findViewById<Button>(R.id.dob_button);
        result=findViewById<EditText>(R.id.result);
        zodiacSign_Image=findViewById(R.id.zodiacSign_Image);

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

        result.setText("Hi "+ name.text.toString() + " Your Zodiac sign is : " + ZodiacSign(day,month))


    }

    private fun ZodiacSign(day:Int,month:Int):String
     {
        var zodiacSign="";

        if(month==0)
        {
            if(day<20)
            { zodiacSign="Capricon";
                zodiacSign_Image.setImageResource(R.drawable.capricorn) ;}
            else
            { zodiacSign="Aquarius";
                zodiacSign_Image.setImageResource(R.drawable.aquarius) ;}
        }


        if(month==1)
        {
            if(day<19)
            { zodiacSign="Aquarius";
                zodiacSign_Image.setImageResource(R.drawable.aquarius) ;}
            else
            { zodiacSign="Pisces";
                zodiacSign_Image.setImageResource(R.drawable.pisces) ;}
        }

        if(month===2)
        {
            if(day<21)
            { zodiacSign="Pisces";
                zodiacSign_Image.setImageResource(R.drawable.pisces) ;}
            else
            { zodiacSign="Aries";
                zodiacSign_Image.setImageResource(R.drawable.aries) ;}
        }

        if(month==3)
        {
            if(day<20)
            { zodiacSign="Aries";
              zodiacSign_Image.setImageResource(R.drawable.aries) ; }
            else
            { zodiacSign="Taurus";
                zodiacSign_Image.setImageResource(R.drawable.taurus) ;}
        }

        if(month==4)
        {
            if(day<21)
            { zodiacSign="Taurus";
                zodiacSign_Image.setImageResource(R.drawable.taurus) ;}
            else
            { zodiacSign="Gemini";
                zodiacSign_Image.setImageResource(R.drawable.gemini) ;}
        }

        if(month==5)
        {
            if(day<22)
            { zodiacSign="Gemini";
                zodiacSign_Image.setImageResource(R.drawable.gemini) ;}
            else
            { zodiacSign="Cancer";
                zodiacSign_Image.setImageResource(R.drawable.cancer) ;}
        }

        if(month==6)
        {
            if(day<23)
            { zodiacSign="Cancer";
                zodiacSign_Image.setImageResource(R.drawable.cancer) ;}
            else
            { zodiacSign="Leo";
                zodiacSign_Image.setImageResource(R.drawable.leo) ;}
        }

        if(month==7)
        {
            if(day<23)
            { zodiacSign="Leo";
                zodiacSign_Image.setImageResource(R.drawable.leo) ;}
            else
            { zodiacSign="Virgo";
                zodiacSign_Image.setImageResource(R.drawable.virgo) ;}
        }

        if(month==8)
        {
            if(day<23)
            { zodiacSign="Virgo";
                zodiacSign_Image.setImageResource(R.drawable.virgo) ;}
            else
            { zodiacSign="Libra";
                zodiacSign_Image.setImageResource(R.drawable.libra) ;}
        }

        if(month==9)
        {
            if(day<24)
            { zodiacSign="Libra";
                zodiacSign_Image.setImageResource(R.drawable.libra) ;}
            else
            { zodiacSign="Scorpius";
                zodiacSign_Image.setImageResource(R.drawable.scorpio) ;}
        }

        if(month==10)
        {
            if(day<22)
            { zodiacSign="Scorpius";
                zodiacSign_Image.setImageResource(R.drawable.scorpio) ;}
            else
            { zodiacSign="Sagittarius";
                zodiacSign_Image.setImageResource(R.drawable.sagittarius) ;}
        }

        if(month==11)
        {
            if(day<22)
            { zodiacSign="Sagittarius";
                zodiacSign_Image.setImageResource(R.drawable.sagittarius) ;}
            else
            { zodiacSign="Capricornus";
                zodiacSign_Image.setImageResource(R.drawable.capricorn) ;}
        }
        return zodiacSign;
    }


}