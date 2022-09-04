package com.example.dz7_3


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz7_3.databinding.ItemImageBinding

class ImageAdapter(

    val data:ArrayList<Image>,
    private var onClick:OnClick
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size


    inner class ImageViewHolder(private val binding: ItemImageBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(model:Image) {
            itemView.setOnClickListener{
            onClick.onClick(model)
            }

            val item = data[adapterPosition]
            binding.tvText.text = item.text
            binding.tvName.text = item.name
binding.ivImage.loadGlide(model.image)


        }


    }
}

