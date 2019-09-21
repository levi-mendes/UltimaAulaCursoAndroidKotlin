package com.example.ultimaaulacursoandroidkotlin

import android.app.Application
import com.example.ultimaaulacursoandroidkotlin.di.network
import com.example.ultimaaulacursoandroidkotlin.di.repositories
import com.example.ultimaaulacursoandroidkotlin.di.viewModels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CasaDoCodigoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(arrayListOf(network, repositories, viewModels))
            androidContext(this@CasaDoCodigoApp)
        }
    }
}