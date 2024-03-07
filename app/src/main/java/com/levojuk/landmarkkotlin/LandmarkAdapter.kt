package com.levojuk.landmarkkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.levojuk.landmarkkotlin.databinding.RecyclerRowBinding
import com.levojuk.landmarkkotlin.databinding.RecyclerRowwBinding

class LandmarkAdapter( val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding : RecyclerRowwBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowwBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
       return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
       holder.binding.recyclerViewTextView2.text= landmarkList.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,Details :: class.java)
            intent.putExtra("landmark", landmarkList.get(position))
            //MySingleton.chosenLandmark = landmarkList[position]
            holder.itemView.context.startActivity(intent)
        }
    }
}