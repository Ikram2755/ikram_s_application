package com.ikramsapplication.app.modules.favourite.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowAdapterseventyBinding
import com.ikramsapplication.app.modules.favourite.`data`.model.AdapterseventyRowModel
import kotlin.Int
import kotlin.collections.List

class AdapterseventyAdapter(
  var list: List<AdapterseventyRowModel>
) : RecyclerView.Adapter<AdapterseventyAdapter.RowAdapterseventyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAdapterseventyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_adapterseventy,parent,false)
    return RowAdapterseventyVH(view)
  }

  override fun onBindViewHolder(holder: RowAdapterseventyVH, position: Int) {
    val adapterseventyRowModel = AdapterseventyRowModel()
    // TODO uncomment following line after integration with data source
    // val adapterseventyRowModel = list[position]
    holder.binding.adapterseventyRowModel = adapterseventyRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AdapterseventyRowModel>) {
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
      item: AdapterseventyRowModel
    ) {
    }
  }

  inner class RowAdapterseventyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAdapterseventyBinding = RowAdapterseventyBinding.bind(itemView)
  }
}
