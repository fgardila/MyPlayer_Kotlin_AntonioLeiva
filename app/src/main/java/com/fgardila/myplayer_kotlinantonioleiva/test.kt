package com.fgardila.myplayer_kotlinantonioleiva

import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

interface Logger {

    val tag: String
        get() = javaClass.simpleName

    fun logD(message: String) = Log.d(tag, message)

    fun logE(message: String) = Log.e(tag, message)
}

fun test(view: View) {
    val result = when (view) {
        is TextView -> print(view.text)
        is ViewGroup -> print(view.childCount)
        else -> print("Nothing found")
    }
}