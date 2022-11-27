package com.ieee.events.ui.EventFragment.EventAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.Branchs
import com.ieee.events.databinding.BranchLiBinding

class BranchsAdapter constructor(val branch:List<Branchs>) : RecyclerView.Adapter<BranchsAdapter.ViewHolder>() {
    inner class ViewHolder(val binding:BranchLiBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            BranchLiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.binding.branchNameTxtRv.text = branch[position].branchName
        holder.binding.branchDetailsTxtRv.text = branch[position].branchDetials
        holder.binding.branchImgRv.setBackgroundResource(branch[position].branchImage)


    }

    override fun getItemCount(): Int {
        return  branch.size
    }

}