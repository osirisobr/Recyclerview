package com.murallaromana.dam.segundo.ejeplorecilerview.modelo.dao

import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades.Personaje

interface personajesDao {

    //public List<personaje> getTodos/getAll/obtenerTodos();

    fun getTodos(): List<Personaje>


}