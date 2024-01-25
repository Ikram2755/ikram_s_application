package com.ikramsapplication.app.modules.recommended.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowGridlocation1Binding
import com.ikramsapplication.app.modules.recommended.`data`.model.Gridlocation1RowModel
import kotlin.Int
import kotlin.collections.List

class GridlocationAdapter(
  var list: List<Gridlocation1RowModel>
) : RecyclerView.Adapter<GridlocationAdapter.RowGridlocation1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlocation1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlocation1,parent,false)
    return RowGridlocation1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridlocation1VH, position: Int) {
    val gridlocation1RowModel = Gridlocation1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridlocation1RowModel = list[position]
    holder.binding.gridlocation1RowModel = gridlocation1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridlocation1RowModel>) {
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
      item: Gridlocation1RowModel
    ) {
    }
  }

  inner class RowGridlocation1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlocation1Binding = RowGridlocation1Binding.bind(itemView)
  }
}
