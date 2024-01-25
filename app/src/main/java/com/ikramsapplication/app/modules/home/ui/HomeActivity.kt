package com.ikramsapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityHomeBinding
import com.ikramsapplication.app.modules.filter.ui.FilterActivity
import com.ikramsapplication.app.modules.home.`data`.model.ListlocationRowModel
import com.ikramsapplication.app.modules.home.`data`.model.RecomendedRowModel
import com.ikramsapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.ikramsapplication.app.modules.recipe.ui.RecipeActivity
import com.ikramsapplication.app.modules.recommended.ui.RecommendedActivity
import com.ikramsapplication.app.modules.seeall.ui.SeeAllActivity
import com.ikramsapplication.app.modules.sidemenu.ui.SideMenuActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlocationAdapter =
    ListlocationAdapter(viewModel.listlocationList.value?:mutableListOf())
    binding.recyclerListlocation.adapter = listlocationAdapter
    listlocationAdapter.setOnItemClickListener(
    object : ListlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlocationRowModel) {
        onClickRecyclerListlocation(view, position, item)
      }
    }
    )
    viewModel.listlocationList.observe(this) {
      listlocationAdapter.updateData(it)
    }
    val recomendedAdapter = RecomendedAdapter(viewModel.recomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recomendedAdapter
    recomendedAdapter.setOnItemClickListener(
    object : RecomendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecomendedRowModel) {
        onClickRecyclerRecomended(view, position, item)
      }
    }
    )
    viewModel.recomendedList.observe(this) {
      recomendedAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    setUpSearchViewGroupSixteenListener()
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeAllOne.setOnClickListener {
      val destIntent = SeeAllActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAll.setOnClickListener {
      val destIntent = RecommendedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = SideMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFreshRecipe.setOnClickListener {
      val destIntent = SeeAllActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlocation(
    view: View,
    position: Int,
    item: ListlocationRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnlocation -> {
        val destIntent = RecipeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: RecomendedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupSixteenListener(): Unit {
    binding.searchViewGroupSixteen.setOnQueryTextListener(object :
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
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
