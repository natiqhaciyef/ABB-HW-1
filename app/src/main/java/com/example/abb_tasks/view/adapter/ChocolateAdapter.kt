package com.example.abb_tasks.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abb_tasks.databinding.RecyclerChocolateItemBinding
import com.example.abb_tasks.data.model.ChocolateModel
import com.example.abb_tasks.view.behavior.ChocolateSetOnClickListener

class ChocolateAdapter(
    val mContext: Context,
    var list: MutableList<ChocolateModel>
) : RecyclerView.Adapter<ChocolateAdapter.ChocolateHolder>(){

    private var listener: ChocolateSetOnClickListener? = null

    inner class ChocolateHolder(val binding: RecyclerChocolateItemBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChocolateHolder {
        val binding = RecyclerChocolateItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChocolateHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ChocolateHolder, position: Int) {
        val view = holder.binding
        val chocolate = list[position]

        view.recyclerImageView.setImageResource(
            mContext.resources.getIdentifier(chocolate.image,"drawable",mContext.packageName)
        )
        view.recyclerNameText.text = chocolate.type
        view.recyclerDescriptionText.text = chocolate.description

        holder.itemView.setOnClickListener {
            listener?.setOnClickListener(chocolate)
        }
    }

    fun onClick(listener: ChocolateSetOnClickListener){
        this.listener = listener
    }
}