package com.ikramsapplication.app.modules.recipedetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityRecipeDetailBinding
import com.ikramsapplication.app.modules.recipedetail.`data`.viewmodel.RecipeDetailVM
import kotlin.String
import kotlin.Unit

class RecipeDetailActivity :
    BaseActivity<ActivityRecipeDetailBinding>(R.layout.activity_recipe_detail) {
  private val viewModel: RecipeDetailVM by viewModels<RecipeDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recipeDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RECIPE_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecipeDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
