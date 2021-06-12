package com.abc.retrofittest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item.view.*
import org.w3c.dom.Text

class MyAdapter(val context: Context,val userList:List<MyDataItem>):RecyclerView.Adapter<MyAdapter.Viewholder>() {
    class Viewholder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var userId:TextView
        var title:TextView
        init {
            userId=itemView.userId
            title=itemView.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_item,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.userId.text = userList[position].userId.toString()
        holder.title.text=userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}