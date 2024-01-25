package com.ikramsapplication.app.modules.recommended.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowGridlocationEight1Binding
import com.ikramsapplication.app.modules.recommended.`data`.model.GridlocationEight1RowModel
import kotlin.Int
import kotlin.collections.List

class GridlocationEightAdapter(
  var list: List<GridlocationEight1RowModel>
) : RecyclerView.Adapter<GridlocationEightAdapter.RowGridlocationEight1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlocationEight1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlocation_eight1,parent,false)
    return RowGridlocationEight1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridlocationEight1VH, position: Int) {
    val gridlocationEight1RowModel = GridlocationEight1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridlocationEight1RowModel = list[position]
    holder.binding.gridlocationEight1RowModel = gridlocationEight1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridlocationEight1RowModel>) {
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
      item: GridlocationEight1RowModel
    ) {
    }
  }

  inner class RowGridlocationEight1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlocationEight1Binding = RowGridlocationEight1Binding.bind(itemView)
  }
}
