package com.ikramsapplication.app.modules.recent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowRecentBinding
import com.ikramsapplication.app.modules.recent.`data`.model.RecentRowModel
import kotlin.Int
import kotlin.collections.List

class RecentAdapter(
  var list: List<RecentRowModel>
) : RecyclerView.Adapter<RecentAdapter.RowRecentVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecentVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recent,parent,false)
    return RowRecentVH(view)
  }

  override fun onBindViewHolder(holder: RowRecentVH, position: Int) {
    val recentRowModel = RecentRowModel()
    // TODO uncomment following line after integration with data source
    // val recentRowModel = list[position]
    holder.binding.recentRowModel = recentRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RecentRowModel>) {
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
      item: RecentRowModel
    ) {
    }
  }

  inner class RowRecentVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRecentBinding = RowRecentBinding.bind(itemView)
  }
}
