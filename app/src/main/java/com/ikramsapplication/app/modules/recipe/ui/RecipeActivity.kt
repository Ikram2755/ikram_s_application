package com.ikramsapplication.app.modules.recipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityRecipeBinding
import com.ikramsapplication.app.modules.recipe.`data`.viewmodel.RecipeVM
import com.ikramsapplication.app.modules.recipedetail.ui.RecipeDetailActivity
import com.ikramsapplication.app.modules.video.ui.VideoActivity
import kotlin.String
import kotlin.Unit

class RecipeActivity : BaseActivity<ActivityRecipeBinding>(R.layout.activity_recipe) {
  private val viewModel: RecipeVM by viewModels<RecipeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRecipe.setOnClickListener {
      val destIntent = RecipeDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnTutorial.setOnClickListener {
      val destIntent = VideoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RECIPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
