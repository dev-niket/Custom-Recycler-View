package com.example.customrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(var names: Array<String>,
                      var age: Array<Int>,
                      var locations: Array<String>):
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        //return null
        val rowPlank: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return EmployeeViewHolder(rowPlank)
    }

    @Override
    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.txtName.text = names[position]
        holder.txtAge.text = age[position].toString()
        holder.txtLocation.text = locations[position]
    }

    @Override
    override fun getItemCount(): Int {
        return names.size
    }

    class EmployeeViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtAge: TextView
        var txtLocation: TextView

        init {
            txtName = itemView.findViewById(R.id.txtName)
            txtAge = itemView.findViewById(R.id.txtAge)
            txtLocation = itemView.findViewById(R.id.txtLocation)
        }
    }

}