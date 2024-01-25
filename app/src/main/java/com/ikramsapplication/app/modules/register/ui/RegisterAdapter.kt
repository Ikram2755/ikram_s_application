package com.ikramsapplication.app.modules.register.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.databinding.RowRegisterBinding
import com.ikramsapplication.app.modules.register.`data`.model.RegisterRowModel
import kotlin.Int
import kotlin.collections.List

class RegisterAdapter(
  var list: List<RegisterRowModel>
) : RecyclerView.Adapter<RegisterAdapter.RowRegisterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRegisterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_register,parent,false)
    return RowRegisterVH(view)
  }

  override fun onBindViewHolder(holder: RowRegisterVH, position: Int) {
    val registerRowModel = RegisterRowModel()
    // TODO uncomment following line after integration with data source
    // val registerRowModel = list[position]
    holder.binding.registerRowModel = registerRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RegisterRowModel>) {
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
      item: RegisterRowModel
    ) {
    }
  }

  inner class RowRegisterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRegisterBinding = RowRegisterBinding.bind(itemView)
  }
}
