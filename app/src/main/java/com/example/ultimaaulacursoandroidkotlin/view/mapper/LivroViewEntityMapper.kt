package com.example.ultimaaulacursoandroidkotlin.view.mapper

import com.example.ultimaaulacursoandroidkotlin.data.entity.LivroViewEntity
import com.example.ultimaaulacursoandroidkotlin.data.model.Livro

class LivroViewEntityMapper {

    fun transform(livro: Livro): LivroViewEntity {
        val autores = "${livro.autores.map {autor -> autor.nome}}"

        return LivroViewEntity(livro.nome, livro.foto, autores)
    }
}