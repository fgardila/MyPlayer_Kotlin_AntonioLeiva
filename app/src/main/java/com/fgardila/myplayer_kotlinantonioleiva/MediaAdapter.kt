package com.fgardila.myplayer_kotlinantonioleiva

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fgardila.myplayer_kotlinantonioleiva.databinding.ViewMediaItemBinding

interface Listener {
    fun onClick(mediaItem: MediaItem)
}

class MediaAdapter(private val items: List<MediaItem>, val listener: Listener): RecyclerView.Adapter<MediaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        val view = parent.inflate(R.layout.view_media_item)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener.onClick(item) }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val binding = ViewMediaItemBinding.bind(view)

        fun bind(mediaItem: MediaItem) {

            with(binding) {
                mediaTitle.text = mediaItem.title
                mediaThumb.loadUrl(mediaItem.url)

                mediaVideoIndicator.visibility = when (mediaItem.type) {
                    MediaItem.Type.PHOTO -> View.GONE
                    MediaItem.Type.VIDEO -> View.VISIBLE
                }

                root.setOnClickListener {
                    toast("Prueba")
                }
            }
        }
    }
}