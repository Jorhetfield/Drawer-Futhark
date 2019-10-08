package es.vanadis.drawertests

import android.app.Application
import es.vanadis.drawertests.setup.di.appComponent
import org.koin.android.ext.android.startKoin

open class App: Application() {

    override fun onCreate() {
        super.onCreate()
        configureDi()
    }

    // CONFIGURATION ---
    open fun configureDi() =
        startKoin(this, provideComponent())

    // PUBLIC API ---
    open fun provideComponent() = appComponent
}