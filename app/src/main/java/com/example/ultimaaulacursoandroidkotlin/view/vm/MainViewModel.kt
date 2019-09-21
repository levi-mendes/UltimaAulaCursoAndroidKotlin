package com.example.ultimaaulacursoandroidkotlin.view.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ultimaaulacursoandroidkotlin.data.entity.LivroViewEntity
import com.example.ultimaaulacursoandroidkotlin.data.repository.LivroRepository
import com.example.ultimaaulacursoandroidkotlin.view.mapper.LivroViewEntityMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: LivroRepository,
                    private val mapper: LivroViewEntityMapper = LivroViewEntityMapper()
)
    : ViewModel() {

    private val livrosLiveData = MutableLiveData<List<LivroViewEntity>>()

    fun getLivros() = livrosLiveData as LiveData<List<LivroViewEntity>>

    fun busca() {

        CoroutineScope(Dispatchers.IO).launch {

            val livros = repository.listar()

            val entities = livros.map{ mapper.transform(it) }

            launch(Dispatchers.Main) {
                livrosLiveData.postValue(entities)
            }
        }
    }
}