package com.example.mad_practical7_21012011002

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val myVideoview = findViewById<VideoView>(R.id.videoView)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()


        }
    }
