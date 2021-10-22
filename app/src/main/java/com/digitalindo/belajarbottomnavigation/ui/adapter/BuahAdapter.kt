package com.digitalindo.belajarbottomnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.digitalindo.belajarbottomnavigation.databinding.ItemBuahBinding
import com.digitalindo.belajarbottomnavigation.ui.model.Buah

class BuahAdapter(val data : ArrayList<Buah>): RecyclerView.Adapter<BuahAdapter.BuahHolder>() {

    class BuahHolder(val binding: ItemBuahBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(get: Buah) {

            binding.textView.text = get.title
            binding.imageView.setImageResource(get.img?:0)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahHolder {

        val binding = ItemBuahBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuahHolder(binding)
    }

    override fun onBindViewHolder(holder: BuahHolder, position: Int) {
        holder.bind(data.get(position))
    }

    // menghitung jumlah data
    override fun getItemCount() = data.size

}