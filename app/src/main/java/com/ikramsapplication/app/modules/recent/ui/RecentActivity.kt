package com.ikramsapplication.app.modules.recent.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityRecentBinding
import com.ikramsapplication.app.modules.filter.ui.FilterActivity
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import com.ikramsapplication.app.modules.recent.`data`.model.RecentRowModel
import com.ikramsapplication.app.modules.recent.`data`.viewmodel.RecentVM
import com.ikramsapplication.app.modules.sidemenu.ui.SideMenuActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecentActivity : BaseActivity<ActivityRecentBinding>(R.layout.activity_recent) {
  private val viewModel: RecentVM by viewModels<RecentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recentAdapter = RecentAdapter(viewModel.recentList.value?:mutableListOf())
    binding.recyclerRecent.adapter = recentAdapter
    recentAdapter.setOnItemClickListener(
    object : RecentAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecentRowModel) {
        onClickRecyclerRecent(view, position, item)
      }
    }
    )
    viewModel.recentList.observe(this) {
      recentAdapter.updateData(it)
    }
    binding.recentVM = viewModel
    setUpSearchViewGroupTwentyFourListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = SideMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerRecent(
    view: View,
    position: Int,
    item: RecentRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupTwentyFourListener(): Unit {
    binding.searchViewGroupTwentyFour.setOnQueryTextListener(object :
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
      const val TAG: String = "RECENT_ACTIVITY"

    }
  }
