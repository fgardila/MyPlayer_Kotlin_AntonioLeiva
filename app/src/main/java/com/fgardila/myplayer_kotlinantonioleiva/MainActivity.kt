package com.fgardila.myplayer_kotlinantonioleiva

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.fgardila.myplayer_kotlinantonioleiva.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity(), Logger {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mBinding.root)

        mBinding.recyclerView.adapter = MediaAdapter(getItems())

        logD("I'm here")

        toast("Hola", Toast.LENGTH_LONG)

        // Version Normal
        //val intent = Intent(this, MainActivity::class.java)
        //startActivity(intent)

        // Version reified
        //startActivity<MainActivity>()
    }
}


