package es.vanadis.testingrunes.setup

import android.content.Context
import com.google.gson.Gson

fun Context.getJsonFromResource(res: Int): String {
    return resources.openRawResource(res)
        .bufferedReader().use { it.readText() }
}

inline fun <reified T : Any> T.json(): String = Gson().toJson(this, T::class.java)
inline fun <reified T : Any> String.fromJson(): T = Gson().fromJson(this, T::class.java)

inline fun <reified T : Any> Context.getMockResult(raw: Int): T {
    val json = this.getJsonFromResource(raw)
    return json.fromJson()
}

inline fun <reified T : Any> Context.getMockResponseResult(raw: Int): ResponseResult.Success<T> {
    return ResponseResult.Success(this.getMockResult(raw))
}