package com.example.multimedia.Audio

import android.annotation.SuppressLint
import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController.MediaPlayerControl
import android.widget.Toast
import com.example.multimedia.R
import java.io.IOException

class AudioActivity : AppCompatActivity() {
    private lateinit var btnplay :Button
    private lateinit var btnstop:Button
    private lateinit var btnPause:Button

    var mediaPlayer:MediaPlayer? = null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        btnplay= findViewById(R.id.btnPlay)
        btnstop= findViewById(R.id.btnEnd)
        btnPause=findViewById(R.id.btnStop)
        mediaPlayer = MediaPlayer.create(this,R.raw.theduel)
         btnplay.setOnClickListener{

             playAudio()
         }
        btnstop.setOnClickListener {
            stopxAudio()
        }
        btnPause.setOnClickListener {
            pauseAudio()
        }
    }

    private fun pauseAudio() {

        mediaPlayer?.pause()

    }

    private fun stopxAudio() {

        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer?.prepare()
        mediaPlayer?.seekTo(0)


    }
    private fun playAudio() {
        mediaPlayer?.start()
    }
}