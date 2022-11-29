package com.ieee.events.ui.exploreFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.TagButtonBinding

class ExploreTagAdapter  constructor(val events: List<Events>) : RecyclerView.Adapter<ExploreTagAdapter.ViewHolder> (){

    inner class ViewHolder(val binding: TagButtonBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            TagButtonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.tagButton.text = events[position].eventTag
    }

    override fun getItemCount(): Int {
        return events.size
    }


}