package com.fgardila.myplayer_kotlinantonioleiva

import android.content.Context
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

fun test(context: Context) {
    val textView = TextView(context).apply {
        text = "Hello"
        hint = "Goodby"
        textSize = 25f
    }
}

fun testLamda() {

    val mul = { x: Int, y: Int -> x * y }
    val res = doOp(2, 3) { x, y ->
        x - y
    }

    val resSum = doOp(2, 4, ::sum)
}

fun sum(x: Int, y: Int): Int = x + y

fun doOp(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)
