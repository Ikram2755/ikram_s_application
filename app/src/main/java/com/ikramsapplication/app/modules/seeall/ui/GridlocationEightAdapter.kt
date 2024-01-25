package com.ikramsapplication.app.modules.seeall.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowGridlocationEightBinding
import com.ikramsapplication.app.modules.seeall.`data`.model.GridlocationEightRowModel
import kotlin.Int
import kotlin.collections.List

class GridlocationEightAdapter(
  var list: List<GridlocationEightRowModel>
) : RecyclerView.Adapter<GridlocationEightAdapter.RowGridlocationEightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlocationEightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlocation_eight,parent,false)
    return RowGridlocationEightVH(view)
  }

  override fun onBindViewHolder(holder: RowGridlocationEightVH, position: Int) {
    val gridlocationEightRowModel = GridlocationEightRowModel()
    // TODO uncomment following line after integration with data source
    // val gridlocationEightRowModel = list[position]
    holder.binding.gridlocationEightRowModel = gridlocationEightRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridlocationEightRowModel>) {
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
      item: GridlocationEightRowModel
    ) {
    }
  }

  inner class RowGridlocationEightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlocationEightBinding = RowGridlocationEightBinding.bind(itemView)
  }
}
