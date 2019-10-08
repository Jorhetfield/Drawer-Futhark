package es.vanadis.app.setup.di

import android.util.Log
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import es.vanadis.testingrunes.setup.VanadisInterceptor
import es.vanadis.testingrunes.setup.VanadisService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val networkModule = module {

    factory<Interceptor>("LogInterceptor") {
        HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { Log.d("API", it) })
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    factory("VanadisInterceptor") {
        VanadisInterceptor(get())
    }

    factory("OkHttpClientVanadis") {
        OkHttpClient.Builder()
            .addInterceptor(get<VanadisInterceptor>("VanadisInterceptor"))
            .build()
    }

    single("VanadisRetrofit") {
        Retrofit.Builder()
            .client(get("OkHttpClientVanadis"))
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    factory("VanadisService") { get<Retrofit>("VanadisRetrofit").create<VanadisService>() }
}