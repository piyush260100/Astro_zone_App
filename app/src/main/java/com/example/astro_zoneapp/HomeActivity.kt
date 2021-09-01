package com.example.astro_zoneapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import org.w3c.dom.Text
import java.util.*

class HomeActivity : AppCompatActivity() , DatePickerDialog.OnDateSetListener{

    lateinit var result:TextView;
    lateinit var name:EditText;
    lateinit var dob_button:Button;
    var day: Int = 0;
    var month:Int=0;
    var year:Int=0;
    lateinit var zodiacSign_Image:ImageView;
    lateinit var resultextview:TextView;
    lateinit var moreinfo2:TextView;
    lateinit var traits:TextView;
    lateinit var Characteristics_heading:TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide();

        name=findViewById<EditText>(R.id.name);
        dob_button=findViewById<Button>(R.id.dob_button);
        result=findViewById<EditText>(R.id.moreinfo1);
        zodiacSign_Image=findViewById(R.id.zodiacSign_Image);
        resultextview=findViewById(R.id.result_textView);
        moreinfo2=findViewById(R.id.moreinfo2);
        traits=findViewById(R.id.traits);
        Characteristics_heading=findViewById(R.id.characteristics);


        dob_button.setOnClickListener (object:View.OnClickListener{
            override fun onClick(p0: View?) {
                //show the date picker
                showDatePickerDialog();
            }
        });

    }

    private fun showDatePickerDialog(){

        val datePickerDialog= DatePickerDialog(this,this,
                                Calendar.getInstance().get(Calendar.YEAR),
                                Calendar.getInstance().get(Calendar.MONTH),
                                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

                datePickerDialog.show();
    }


    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

        //return the selected date
        resultextview.visibility=View.VISIBLE;
        moreinfo2.visibility=View.VISIBLE;
        traits.visibility=View.VISIBLE;
        Characteristics_heading.visibility=View.VISIBLE;

        result.setText("Hi, "+ name.text.toString());
        moreinfo2.setText("Zodiac Sign : " + ZodiacSign(p3,p2));
        traits.setText(Characteristcsofperson(ZodiacSign(p3,p2)));
        Log.e("Res",ZodiacSign(p3,p2));
        Log.e("Date",p1.toString() + (p2+1).toString() + p3.toString())
        result.visibility= View.VISIBLE;
        zodiacSign_Image.visibility=View.VISIBLE;


    }

    private fun Characteristcsofperson(zodiacsign:String):String{
        var s ="";
        if(zodiacsign=="Aries") {
            s =
                "Strength: hopeful, active, energetic, honest, versatile, brave, adventurous, passionate, generous, cheerful, argumentative, curious\n" +
                       "\n"+ "Weakness: impulsive, naive, self-willed, belligerent, impatient";
        }
        if(zodiacsign=="Taurus") {
            s =
                "Strength: romantic, decisive, logical, diligent, ardent, patient, talented in art, perseverant, benevolent"+"\n"+
                   "Weakness: prejudiced, dependent, stubborn";
        }

        if(zodiacsign=="Gemini") {
            s =
                "Strength: multifarious, perspicacious, smart, cheerful, quick-witted, clement, charming"+"\n"+
                        "Weakness: fickle, gossipy, amphibian";
        }

        if(zodiacsign=="Cancer") {
            s =
                "Strength: with strong sixth sense, subjective, gentle, swift, imaginative, careful, dedicated, perseverant, kind, caring"+"\n" +
                        "Weakness: greedy, possessive, sensitive, prim";
        }

        if(zodiacsign=="Leo") {
            s =
                "Strength: proud, charitable, reflective, loyal and enthusiastic"+"\n" +
                        "Weakness: arrogant, vainglorious, indulgent, wasteful, willful, and self-complacent";
        }

        if(zodiacsign=="Virgo") {
            s =
                "Strength: helping, elegant, perfectionist, modest, practical, clearheaded"+"\n" +
                        "Weakness: picky, nosey, tortuous, confining";
        }

        if(zodiacsign=="Libra") {
            s =
                "Strength: idealistic, equitable, just, strong social skills, aesthetic, charming, artistic, beautiful, kind-hearted"+"\n" +
                        "Weakness: hesitant, narcissistic, lazy, perfunctory, freewheeling";
        }

        if(zodiacsign=="Scorpius") {
            s =
                "Strength: mysterious, rational, intelligent, independent, intuitive, dedicated, insightful, charming, sensible"+"\n" +
                        "Weakness: suspicious, fanatical, complicated, possessive, arrogant, self-willed, extreme";
        }

        if(zodiacsign=="Sagittarius") {
            s =
                "Strength: insightful, superior, rational, brave, beautiful, lively, lovely, optimistic"+"\n" +
                        "Weakness: forgetful, careless, rash";
        }

        if(zodiacsign=="Capricon") {
            s =
                "Strength: excellent, intelligent, practical, reliable, perseverant, generous, optimistic, cute, persistent"+"\n" +
                        "Weakness: stubborn, lonely, and suspicious";
        }

        if(zodiacsign=="Aquarius") {
            s =
                "Strength: original, tolerant, ideal, calm, friendly, charitable, independent, smart, practical"+"\n" +
                        "Weakness: changeful, disobedient, liberalistic, hasty, rebel";
        }

        if(zodiacsign=="Pisces") {
            s =
                "Strength: conscious, aesthetic, platonic, dedicated, kind, with good temper"+"\n" +
                        "Weakness: recessive, sentimental, indecisive, unrealistic";
        }


        return s;
    }

    private fun ZodiacSign(day:Int,month:Int):String {
        var zodiacSign = "";

        if (month == 0) {
            if (day < 20) {
                zodiacSign = "Capricon";
                zodiacSign_Image.setImageResource(R.drawable.capricorn);
            } else {
                zodiacSign = "Aquarius";
                zodiacSign_Image.setImageResource(R.drawable.aquarius);
            }
        } else if (month == 1) {
            if (day < 19) {
                zodiacSign = "Aquarius";
                zodiacSign_Image.setImageResource(R.drawable.aquarius);
            } else {
                zodiacSign = "Pisces";
                zodiacSign_Image.setImageResource(R.drawable.pisces);
            }
        } else if (month === 2) {
            if (day < 21) {
                zodiacSign = "Pisces";
                zodiacSign_Image.setImageResource(R.drawable.pisces);
            } else {
                zodiacSign = "Aries";
                zodiacSign_Image.setImageResource(R.drawable.aries);
            }
        } else if (month == 3) {
            if (day < 20) {
                zodiacSign = "Aries";
                zodiacSign_Image.setImageResource(R.drawable.aries); } else {
                zodiacSign = "Taurus";
                zodiacSign_Image.setImageResource(R.drawable.taurus);
            }
        } else if (month == 4) {
            if (day < 21) {
                zodiacSign = "Taurus";
                zodiacSign_Image.setImageResource(R.drawable.taurus);
            } else {
                zodiacSign = "Gemini";
                zodiacSign_Image.setImageResource(R.drawable.gemini);
            }
        } else if (month == 5) {
            if (day < 22) {
                zodiacSign = "Gemini";
                zodiacSign_Image.setImageResource(R.drawable.gemini);
            } else {
                zodiacSign = "Cancer";
                zodiacSign_Image.setImageResource(R.drawable.cancer);
            }
        } else if (month == 6) {
            if (day < 23) {
                zodiacSign = "Cancer";
                zodiacSign_Image.setImageResource(R.drawable.cancer);
            } else {
                zodiacSign = "Leo";
                zodiacSign_Image.setImageResource(R.drawable.leo);
            }
        } else if (month == 7) {
            if (day < 23) {
                zodiacSign = "Leo";
                zodiacSign_Image.setImageResource(R.drawable.leo);
            } else {
                zodiacSign = "Virgo";
                zodiacSign_Image.setImageResource(R.drawable.virgo);
            }
        } else if (month == 8) {
            if (day < 23) {
                zodiacSign = "Virgo";
                zodiacSign_Image.setImageResource(R.drawable.virgo);
            } else {
                zodiacSign = "Libra";
                zodiacSign_Image.setImageResource(R.drawable.libra);
            }
        } else if (month == 9) {
            if (day < 24) {
                zodiacSign = "Libra";
                zodiacSign_Image.setImageResource(R.drawable.libra);
            } else {
                zodiacSign = "Scorpius";
                zodiacSign_Image.setImageResource(R.drawable.scorpio);
            }
        } else if (month == 10) {
            if (day < 22) {
                zodiacSign = "Scorpius";
                zodiacSign_Image.setImageResource(R.drawable.scorpio);
            } else {
                zodiacSign = "Sagittarius";
                zodiacSign_Image.setImageResource(R.drawable.sagittarius);
            }
        } else if (month == 11) {
            if (day < 22) {
                zodiacSign = "Sagittarius";
                zodiacSign_Image.setImageResource(R.drawable.sagittarius);
            } else {
                zodiacSign = "Capricon";
                zodiacSign_Image.setImageResource(R.drawable.capricorn);
            }
        }
        return zodiacSign;
    }

}