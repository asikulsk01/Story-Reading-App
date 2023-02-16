package com.example.intent

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Code for audio and Back button
        val btnListenStory2= findViewById<Button>(R.id.btnListenStory2)
        val btnBack= findViewById<Button>(R.id.btnScrn2Back)

        //Mediaplayer declaration.
        val story2Audio= MediaPlayer.create(applicationContext,R.raw.story2audio)

        //Method define
        btnListenStory2.setOnClickListener {
            story2Audio.start()
        }
        btnBack.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}