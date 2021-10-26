package com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades

class Personaje (
    var id: Long,
    var   nombres: String,
    var apellidos: String,
    var titulo: String,
    var familia: String,
    var url: String,
    var nombre: String = ""
    )

{

    fun getNombreCompleto():String{
        return nombres+""+apellidos
    }
    fun getNombreCompleto2():String{
        return "El nombre es : ${this.nombres} y el apellido es: ${this.apellidos}"
    }
    fun getNombreCompleto3() = "El nombre es : ${this.nombres} y el apellido es: ${this.apellidos}"




}