package com.ieee.events.ui.EventFragment.EventAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.Speakrs
import com.ieee.events.databinding.SpeakersLiBinding

class SpeakerAdapter constructor(val speaker:List<Speakrs>) : RecyclerView.Adapter<SpeakerAdapter.ViewHolder>() {
    inner class ViewHolder(val binding:SpeakersLiBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            SpeakersLiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.speakerNameTxt.text = speaker[position].speakerName
        holder.binding.speakerTitleTxt.text = speaker[position].speakerDetaisls
        holder.binding.speakerImg.setBackgroundResource(speaker[position].speakrImage)
    }

    override fun getItemCount(): Int {
       return speaker.size
    }

}