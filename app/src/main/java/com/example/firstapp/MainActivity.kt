package com.example.firstapp

import android.graphics.BitmapFactory
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import org.xmlpull.v1.XmlPullParser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 15f


    }
}