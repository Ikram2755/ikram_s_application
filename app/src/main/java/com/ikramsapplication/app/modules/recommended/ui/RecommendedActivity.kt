package com.ikramsapplication.app.modules.recommended.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityRecommendedBinding
import com.ikramsapplication.app.modules.filter.ui.FilterActivity
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import com.ikramsapplication.app.modules.recommended.`data`.model.Gridlocation1RowModel
import com.ikramsapplication.app.modules.recommended.`data`.model.GridlocationEight1RowModel
import com.ikramsapplication.app.modules.recommended.`data`.model.RecommendedRowModel
import com.ikramsapplication.app.modules.recommended.`data`.viewmodel.RecommendedVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecommendedActivity : BaseActivity<ActivityRecommendedBinding>(R.layout.activity_recommended)
    {
  private val viewModel: RecommendedVM by viewModels<RecommendedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlocationAdapter =
    GridlocationAdapter(viewModel.gridlocationList.value?:mutableListOf())
    binding.recyclerGridlocation.adapter = gridlocationAdapter
    gridlocationAdapter.setOnItemClickListener(
    object : GridlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridlocation1RowModel) {
        onClickRecyclerGridlocation(view, position, item)
      }
    }
    )
    viewModel.gridlocationList.observe(this) {
      gridlocationAdapter.updateData(it)
    }
    val recommendedAdapter =
    RecommendedAdapter(viewModel.recommendedList.value?:mutableListOf())
    binding.recyclerRecommended.adapter = recommendedAdapter
    recommendedAdapter.setOnItemClickListener(
    object : RecommendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecommendedRowModel) {
        onClickRecyclerRecommended(view, position, item)
      }
    }
    )
    viewModel.recommendedList.observe(this) {
      recommendedAdapter.updateData(it)
    }
    val gridlocationEightAdapter =
    GridlocationEightAdapter(viewModel.gridlocationEightList.value?:mutableListOf())
    binding.recyclerGridlocationEight.adapter = gridlocationEightAdapter
    gridlocationEightAdapter.setOnItemClickListener(
    object : GridlocationEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlocationEight1RowModel) {
        onClickRecyclerGridlocationEight(view, position, item)
      }
    }
    )
    viewModel.gridlocationEightList.observe(this) {
      gridlocationEightAdapter.updateData(it)
    }
    binding.recommendedVM = viewModel
    setUpSearchViewGroupTwentyOneListener()
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
    item: Gridlocation1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRecommended(
    view: View,
    position: Int,
    item: RecommendedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGridlocationEight(
    view: View,
    position: Int,
    item: GridlocationEight1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupTwentyOneListener(): Unit {
    binding.searchViewGroupTwentyOne.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
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
      const val TAG: String = "RECOMMENDED_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RecommendedActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
