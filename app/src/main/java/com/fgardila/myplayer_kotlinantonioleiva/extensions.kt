package com.fgardila.myplayer_kotlinantonioleiva

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

fun RecyclerView.ViewHolder.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    itemView.context.toast(message, length)
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View = LayoutInflater
    .from(context)
    .inflate(R.layout.view_media_item, this, false)

fun ImageView.loadUrl(url: String) {
    Glide.with(this).load(url).into(this)
}

inline fun <reified T: Activity> Context.startActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}
