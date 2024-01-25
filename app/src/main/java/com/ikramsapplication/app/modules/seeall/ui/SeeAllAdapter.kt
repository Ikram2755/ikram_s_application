package com.ikramsapplication.app.modules.seeall.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowSeeAllBinding
import com.ikramsapplication.app.modules.seeall.`data`.model.SeeAllRowModel
import kotlin.Int
import kotlin.collections.List

class SeeAllAdapter(
  var list: List<SeeAllRowModel>
) : RecyclerView.Adapter<SeeAllAdapter.RowSeeAllVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeAllVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_all,parent,false)
    return RowSeeAllVH(view)
  }

  override fun onBindViewHolder(holder: RowSeeAllVH, position: Int) {
    val seeAllRowModel = SeeAllRowModel()
    // TODO uncomment following line after integration with data source
    // val seeAllRowModel = list[position]
    holder.binding.seeAllRowModel = seeAllRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SeeAllRowModel>) {
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
      item: SeeAllRowModel
    ) {
    }
  }

  inner class RowSeeAllVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSeeAllBinding = RowSeeAllBinding.bind(itemView)
  }
}
