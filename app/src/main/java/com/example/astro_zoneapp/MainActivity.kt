package com.example.astro_zoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide();

        var begin=findViewById<Button>(R.id.lets_begin);
        begin.setOnClickListener{
            val intent =  Intent(this, HomeActivity::class.java);
                        startActivity (intent);
            Toast.makeText(this@MainActivity,"Let's Begin",Toast.LENGTH_SHORT).show();

        }


    }
}