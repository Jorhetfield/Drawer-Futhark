package es.vanadis.app.setup.di

import es.vanadis.testingrunes.setup.Prefs
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

val preferencesModule = module {
    factory { Prefs(androidApplication()) }
}