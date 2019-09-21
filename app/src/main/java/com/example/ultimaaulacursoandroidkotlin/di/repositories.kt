package com.example.ultimaaulacursoandroidkotlin.di

import com.example.ultimaaulacursoandroidkotlin.data.repository.LivroRepository
import org.koin.dsl.module

val repositories = module {

    single { LivroRepository(api = get()) }
}