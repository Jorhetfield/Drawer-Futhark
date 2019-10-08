package es.vanadis.testingrunes.setup

import android.util.Log

const val FILTER = "--->DevFilter"

fun Any.logd(text: String) {
    Log.d("$FILTER: ${this::class.java.simpleName}", text)
}

fun Any.logd(text: String, exception: Exception) {
    Log.d("$FILTER: ${this::class.java.simpleName}", text, exception)
}

