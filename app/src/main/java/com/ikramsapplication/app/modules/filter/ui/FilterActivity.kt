package com.ikramsapplication.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityFilterBinding
import com.ikramsapplication.app.modules.filter.`data`.viewmodel.FilterVM
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
