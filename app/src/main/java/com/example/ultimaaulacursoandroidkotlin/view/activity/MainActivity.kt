package com.example.ultimaaulacursoandroidkotlin.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.ultimaaulacursoandroidkotlin.R
import com.example.ultimaaulacursoandroidkotlin.view.vm.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.busca()

        viewModel.getLivros().observe(this, Observer {

            Log.i("lista", "$it")
        })
    }
}