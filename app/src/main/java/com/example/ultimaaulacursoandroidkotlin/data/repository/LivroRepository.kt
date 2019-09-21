package com.example.ultimaaulacursoandroidkotlin.data.repository

import com.example.ultimaaulacursoandroidkotlin.data.network.CasaDoCodigoApi

class LivroRepository (private val api: CasaDoCodigoApi) {

    suspend fun listar() = api.listar().livros
}