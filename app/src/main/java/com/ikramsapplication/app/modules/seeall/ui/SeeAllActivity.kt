package com.ikramsapplication.app.modules.seeall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivitySeeAllBinding
import com.ikramsapplication.app.modules.filter.ui.FilterActivity
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import com.ikramsapplication.app.modules.seeall.`data`.model.GridlocationEightRowModel
import com.ikramsapplication.app.modules.seeall.`data`.model.GridlocationRowModel
import com.ikramsapplication.app.modules.seeall.`data`.model.SeeAllRowModel
import com.ikramsapplication.app.modules.seeall.`data`.viewmodel.SeeAllVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeeAllActivity : BaseActivity<ActivitySeeAllBinding>(R.layout.activity_see_all) {
  private val viewModel: SeeAllVM by viewModels<SeeAllVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlocationAdapter =
    GridlocationAdapter(viewModel.gridlocationList.value?:mutableListOf())
    binding.recyclerGridlocation.adapter = gridlocationAdapter
    gridlocationAdapter.setOnItemClickListener(
    object : GridlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlocationRowModel) {
        onClickRecyclerGridlocation(view, position, item)
      }
    }
    )
    viewModel.gridlocationList.observe(this) {
      gridlocationAdapter.updateData(it)
    }
    val seeAllAdapter = SeeAllAdapter(viewModel.seeAllList.value?:mutableListOf())
    binding.recyclerSeeAll.adapter = seeAllAdapter
    seeAllAdapter.setOnItemClickListener(
    object : SeeAllAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SeeAllRowModel) {
        onClickRecyclerSeeAll(view, position, item)
      }
    }
    )
    viewModel.seeAllList.observe(this) {
      seeAllAdapter.updateData(it)
    }
    val gridlocationEightAdapter =
    GridlocationEightAdapter(viewModel.gridlocationEightList.value?:mutableListOf())
    binding.recyclerGridlocationEight.adapter = gridlocationEightAdapter
    gridlocationEightAdapter.setOnItemClickListener(
    object : GridlocationEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlocationEightRowModel) {
        onClickRecyclerGridlocationEight(view, position, item)
      }
    }
    )
    viewModel.gridlocationEightList.observe(this) {
      gridlocationEightAdapter.updateData(it)
    }
    binding.seeAllVM = viewModel
    setUpSearchViewGroupTenListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridlocation(
    view: View,
    position: Int,
    item: GridlocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerSeeAll(
    view: View,
    position: Int,
    item: SeeAllRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGridlocationEight(
    view: View,
    position: Int,
    item: GridlocationEightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupTenListener(): Unit {
    binding.searchViewGroupTen.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "SEE_ALL_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SeeAllActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
