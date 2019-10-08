package es.vanadis.testingrunes.setup

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

class VanadisInterceptor(private val prefs: Prefs) : Interceptor {

    /**
     * Interceptor class for setting of the headers for every request
     */
    override fun intercept(chain: Interceptor.Chain): Response {

        Log.d(VanadisInterceptor::class.java.simpleName, "Authorization: ${prefs.token}")

        var request = chain.request()

        prefs.token?.let { authToken ->
            request = request.newBuilder()
                .addHeader("Authorization", authToken)
                .build()
        }

        return chain.proceed(request)
    }
}