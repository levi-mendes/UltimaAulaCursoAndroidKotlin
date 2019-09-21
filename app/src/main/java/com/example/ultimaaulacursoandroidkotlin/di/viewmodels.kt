package com.example.ultimaaulacursoandroidkotlin.di

import com.example.ultimaaulacursoandroidkotlin.view.vm.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels = module {

    viewModel { MainViewModel(repository = get()) }
}