package com.example.ultimaaulacursoandroidkotlin.data.network

import com.example.ultimaaulacursoandroidkotlin.data.model.LivroDTO
import retrofit2.Retrofit
import retrofit2.http.GET

class CasaDoCodigoApi(private val retrofit: Retrofit) {

    private val service: CasaDoCodigoService by lazy {
        retrofit.create(CasaDoCodigoService::class.java)
    }

    suspend fun listar() = service.listar()

    interface CasaDoCodigoService {

        @GET("listarLivros?indicePrimeiroLivro=0&qtdLivros=20")
        suspend fun listar(): LivroDTO
    }
}