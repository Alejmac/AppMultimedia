package com.example.multimedia.Video

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.multimedia.R

class VideoActivity : AppCompatActivity() {
  private var videoView : VideoView?  =null
private  var mediaController:MediaController?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)


        videoView= findViewById(R.id.vdw)
        setUpPlayer()
    }

    private fun setUpPlayer() {
        if(mediaController== null){
            mediaController= MediaController(this)
            mediaController!!.setAnchorView(this.videoView)

        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.video2))
        videoView!!.requestFocus()
        videoView!!.pause()
        videoView!!.setOnCompletionListener {
            Toast.makeText(this, "video completado ", Toast.LENGTH_SHORT).show()
        }
        videoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(this, "el video  no se puede reproducir...", Toast.LENGTH_SHORT).show()
            false }
    }

}