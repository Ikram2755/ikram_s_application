package com.ikramsapplication.app.modules.favourite.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowListlocationSixBinding
import com.ikramsapplication.app.modules.favourite.`data`.model.ListlocationSixRowModel
import kotlin.Int
import kotlin.collections.List

class ListlocationSixAdapter(
  var list: List<ListlocationSixRowModel>
) : RecyclerView.Adapter<ListlocationSixAdapter.RowListlocationSixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlocationSixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlocation_six,parent,false)
    return RowListlocationSixVH(view)
  }

  override fun onBindViewHolder(holder: RowListlocationSixVH, position: Int) {
    val listlocationSixRowModel = ListlocationSixRowModel()
    // TODO uncomment following line after integration with data source
    // val listlocationSixRowModel = list[position]
    holder.binding.listlocationSixRowModel = listlocationSixRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlocationSixRowModel>) {
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
      item: ListlocationSixRowModel
    ) {
    }
  }

  inner class RowListlocationSixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlocationSixBinding = RowListlocationSixBinding.bind(itemView)
  }
}
