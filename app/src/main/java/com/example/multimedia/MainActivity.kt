package com.example.multimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.multimedia.Audio.AudioActivity
import com.example.multimedia.Video.VideoActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnAudio:Button
    private lateinit var btnVideo :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnAudio = findViewById<Button>(R.id.btnAudio)
        btnVideo= findViewById<Button>(R.id.btnVideo)
        btnAudio.setOnClickListener {
            NavigatetoAudio()
        }

        btnVideo.setOnClickListener {

            NavigatorVideo()
        }
    }

    private fun NavigatorVideo() {
         val intent=Intent(this,VideoActivity::class.java)
        startActivity(intent)
    }

    private fun NavigatetoAudio() {
        val intent= Intent(this,AudioActivity::class.java)
        startActivity(intent)
    }
}