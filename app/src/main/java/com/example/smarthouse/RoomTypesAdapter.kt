package com.example.smarthouse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

<<<<<<< HEAD
class RoomTypesAdapter (
    private val onRoomTypeClick : (RoomType) -> Unit ) : RecyclerView.Adapter<RoomTypesAdapter.RoomTypeViewHolder>(){
private  val roomTypes = mutableListOf<RoomType>()
    fun submitList(list: List<RoomType>){
        roomTypes.clear()
        roomTypes.addAll(list)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomTypeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_room, parent, false)
        return RoomTypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RoomTypeViewHolder, position: Int) {
        holder.bind(roomTypes[position])
    }

    override fun getItemCount() = roomTypes.size
    inner class RoomTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val roomIcon: ImageView = itemView.findViewById(R.id.roomIcon)
        private val roomName: TextView = itemView.findViewById(R.id.roomName)

        fun bind(roomType: RoomType) {
            roomName.text = roomType.name
            Glide.with(itemView.context)
                .load(roomType.iconUrl)
                .placeholder(R.drawable.placeholder_room)
                .into(roomIcon)

            itemView.setOnClickListener {
                onRoomTypeClick(roomType)
            }
        }
    }
    }
=======
class RoomTypesAdapter(private val rooms:List<RoomType>) : RecyclerView.Adapter<RoomTypesAdapter.RoomViewHolder>(){
    class RoomViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val roomImageView : ImageView = itemView.findViewById(R.id.roomIcon)
        val roomNameTextView : TextView = itemView.findViewById(R.id.roomName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_room,parent,false)
        return RoomViewHolder(view)
    }

    override fun getItemCount(): Int = rooms.size

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val room = rooms[position]
        holder.roomNameTextView.text = room.name
        Glide.with(holder.itemView.context).load(room.iconUrl).into(holder.roomImageView)
    }

}
>>>>>>> bd831a1 (day)
