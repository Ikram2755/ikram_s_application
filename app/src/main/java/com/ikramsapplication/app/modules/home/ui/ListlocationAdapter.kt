package com.ikramsapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowListlocationBinding
import com.ikramsapplication.app.modules.home.`data`.model.ListlocationRowModel
import kotlin.Int
import kotlin.collections.List

class ListlocationAdapter(
  var list: List<ListlocationRowModel>
) : RecyclerView.Adapter<ListlocationAdapter.RowListlocationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlocationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlocation,parent,false)
    return RowListlocationVH(view)
  }

  override fun onBindViewHolder(holder: RowListlocationVH, position: Int) {
    val listlocationRowModel = ListlocationRowModel()
    // TODO uncomment following line after integration with data source
    // val listlocationRowModel = list[position]
    holder.binding.listlocationRowModel = listlocationRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlocationRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListlocationRowModel
    ) {
    }
  }

  inner class RowListlocationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlocationBinding = RowListlocationBinding.bind(itemView)
    init {
      binding.linearColumnlocation.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListlocationRowModel())
      }
    }
  }
}
