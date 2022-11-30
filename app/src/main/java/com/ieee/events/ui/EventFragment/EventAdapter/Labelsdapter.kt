package com.ieee.events.ui.EventFragment.EventAdapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.Labels
import com.ieee.events.databinding.LabelsRvLayoutBinding

class Labelsdapter constructor(val label :List<Labels>):RecyclerView.Adapter<Labelsdapter.ViewHolder>() {
    inner class ViewHolder(val binding:LabelsRvLayoutBinding):
    RecyclerView.ViewHolder(binding.root)



    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view=
        LabelsRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.labelRv.text = label[position].labelName
    }

    override fun getItemCount(): Int {
        return label.size
    }
}