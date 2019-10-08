package es.vanadis.drawertests.setup.di

import es.vanadis.app.setup.di.networkModule
import es.vanadis.app.setup.di.preferencesModule
import es.vanadis.app.setup.di.repositoryModule

val appComponent = listOf(networkModule, repositoryModule, preferencesModule)
