package es.vanadis.app.setup.di

import es.vanadis.testingrunes.setup.VanadisRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val repositoryModule = module {
    factory { VanadisRepository(get(), androidContext()) }
}