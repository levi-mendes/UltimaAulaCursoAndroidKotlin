package com.example.ultimaaulacursoandroidkotlin.di

import com.example.ultimaaulacursoandroidkotlin.data.network.CasaDoCodigoApi
import com.example.ultimaaulacursoandroidkotlin.data.network.InicializadorDoRetrofit
import org.koin.dsl.module

val network = module {

    single { InicializadorDoRetrofit().getInstance() }
    single { CasaDoCodigoApi(get()) }
}