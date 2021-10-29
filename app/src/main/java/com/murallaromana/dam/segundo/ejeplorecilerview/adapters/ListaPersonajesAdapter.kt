package com.murallaromana.dam.segundo.ejeplorecilerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromana.dam.segundo.ejeplorecilerview.R
import com.murallaromana.dam.segundo.ejeplorecilerview.modelo.entidades.Personaje

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    class PersonajesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val tvFoto = itemView.findViewById<TextView>(R.id.tvFoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_personaje,parent, false)

        return PersonajesViewHolder(layoutInflater)


    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)

        holder.tvNombre.setText(personaje.nombre)
        holder.tvTitulo.setText(personaje.titulo)

    }

    override fun getItemCount(): Int {

        TODO("Not yet implemented")
    }


}