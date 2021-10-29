package com.murallaromana.dam.segundo.ejeplorecilerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.dam.segundo.ejeplorecilerview.R
import com.murallaromana.dam.segundo.ejeplorecilerview.adapters.ListaPersonajesAdapter
import com.murallaromana.dam.segundo.ejeplorecilerview.databinding.ActivityMainBinding
import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.dao.PersonajesDaoMockImpl
import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //layoutManager layoutManager = new LinearLayoutManager(this)

        // Obtengo los datos del personaje
        val personajesDao = PersonajesDaoMockImpl()
        val listaPersonajes = personajesDao.getTodos()
        //Creo los componentes que necesita el RecyclerView
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)
        //Asocio el RecylerView con sus componentes
        binding.rvListaPersonajes.adapter




















    }
}
//  val layoutManager = LinearLayoutManager(this)
//
//        val p = Personaje  (0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targayen", "proba")
//        val p2 = Personaje (0, "Jon", "nieve", "King of the North", "House Stark", "https://thronesapi.com/assets/images/jon-snow.jpg")
//        val p3 = Personaje (0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targayen", "proba")
//        val p4 = Personaje (0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targayen", "proba")
//
//
//        val listaNumeros = listOf(p,p2,p3,p4)
//
//
//
//
//        println(p.getNombreCompleto())
//
//
//
//
//
//        println(p.getNombreCompleto())