package com.example.intent

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code for audio and Next button.
        val btnListenStory1= findViewById<Button>(R.id.btnListenStory1)
        val btnNext= findViewById<Button>(R.id.btnScrn1Next)

        //Mediaplayer declaration.
        val story1audio= MediaPlayer.create(applicationContext,R.raw.story1audio)

        //Method define
        btnListenStory1.setOnClickListener {
            story1audio.start()
            Toast.makeText(applicationContext,"Story one is playing",Toast.LENGTH_SHORT).show()
        }

        btnNext.setOnClickListener {
            //Transfer to new activity.
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}