package com.example.ultimaaulacursoandroidkotlin.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class InicializadorDoRetrofit {

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://cdcmob.herokuapp.com/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
    }
}