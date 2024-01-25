package com.ikramsapplication.app.modules.favourite.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityFavouriteBinding
import com.ikramsapplication.app.modules.favourite.`data`.model.AdapterseventyRowModel
import com.ikramsapplication.app.modules.favourite.`data`.model.ListlocationSixRowModel
import com.ikramsapplication.app.modules.favourite.`data`.viewmodel.FavouriteVM
import com.ikramsapplication.app.modules.filter.ui.FilterActivity
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavouriteActivity : BaseActivity<ActivityFavouriteBinding>(R.layout.activity_favourite) {
  private val viewModel: FavouriteVM by viewModels<FavouriteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val adapterseventyAdapter =
    AdapterseventyAdapter(viewModel.adapterseventyList.value?:mutableListOf())
    binding.recyclerAdapterseventy.adapter = adapterseventyAdapter
    adapterseventyAdapter.setOnItemClickListener(
    object : AdapterseventyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AdapterseventyRowModel) {
        onClickRecyclerAdapterseventy(view, position, item)
      }
    }
    )
    viewModel.adapterseventyList.observe(this) {
      adapterseventyAdapter.updateData(it)
    }
    val listlocationSixAdapter =
    ListlocationSixAdapter(viewModel.listlocationSixList.value?:mutableListOf())
    binding.recyclerListlocationSix.adapter = listlocationSixAdapter
    listlocationSixAdapter.setOnItemClickListener(
    object : ListlocationSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlocationSixRowModel) {
        onClickRecyclerListlocationSix(view, position, item)
      }
    }
    )
    viewModel.listlocationSixList.observe(this) {
      listlocationSixAdapter.updateData(it)
    }
    binding.favouriteVM = viewModel
    setUpSearchViewGroupFourListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerAdapterseventy(
    view: View,
    position: Int,
    item: AdapterseventyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlocationSix(
    view: View,
    position: Int,
    item: ListlocationSixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupFourListener(): Unit {
    binding.searchViewGroupFour.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "FAVOURITE_ACTIVITY"

    }
  }
