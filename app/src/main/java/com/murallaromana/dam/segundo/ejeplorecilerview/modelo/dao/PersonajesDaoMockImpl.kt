package com.murallaromana.dam.segundo.ejeplorecilerview.modelo.dao

import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades.Personaje

class PersonajesDaoMockImpl : personajesDao {


    override fun getTodos() = listOf(

            Personaje(
                0,
                "Daenerys",
                "Targaryen",
                "Mother of Dragons",
                "House Targayen",
                "https://thronesapi.com/assets/images/daenerys.jpg"
            ),
            Personaje(
                0,
                "Jon",
                "nieve",
                "King of the North",
                "House Stark",
                "https://thronesapi.com/assets/images/jon-snow.jpg"
            ),
            Personaje(
                0,
                "Arya",
                "Stark",
                "No One",
                "House Stark",
                "https://thronesapi.com/assets/images/arya-stark.jpg"
            ),
            Personaje(
                0,
                "Cersei",
                "Lannister",
                "Lady of Casterly Rock",
                "House Lannister",
                "https://thronesapi.com/assets/images/cersei.jpg"
            )
        )
        fun prueba(){
            var lista = ArrayList<Personaje>()
            lista.add(Personaje)



        }



}



