package com.ieee.events.ui.BookEvent.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.Particepent
import com.ieee.events.databinding.ParticepentLiBinding

class ParticipantAdapter constructor(val particepent:List<Particepent>) :RecyclerView.Adapter<ParticipantAdapter.ViewHolder>() {
    inner class ViewHolder(val binding : ParticepentLiBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            ParticepentLiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.partNameTxt.text = particepent[position].name
        holder.binding.partEmailTxt.text = particepent[position].email
        holder.binding.partPhoneTxt.text = particepent[position].phoneNumber
    }

    override fun getItemCount(): Int {
        return particepent.size
    }

}