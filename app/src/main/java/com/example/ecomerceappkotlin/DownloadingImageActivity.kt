package com.example.ecomerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_downloading_image.*

class DownloadingImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloading_image)


        btnDownloadImage.setOnClickListener {

          val  imageURL = "https://reggaerencontre.com/assets/img/lion.png"

            Picasso.with(this).load(imageURL).into(imgDownloadedImage)




            val requestQ: RequestQueue = Volley.newRequestQueue(this)

        }



    }
}