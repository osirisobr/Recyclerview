package com.murallaromana.dam.segundo.ejeplorecilerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.dam.segundo.ejeplorecilerview.R
import com.murallaromana.dam.segundo.ejeplorecilerview.databinding.ActivityMainBinding
import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //layoutManager layoutManager = new LinearLayoutManager(this)
        val layoutManager = LinearLayoutManager(this)

        val p = Personaje (0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targayen", "proba")
        println(p.getNombreCompleto())





    }
}