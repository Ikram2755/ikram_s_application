package com.ikramsapplication.app.modules.sidemenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivitySideMenuBinding
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import com.ikramsapplication.app.modules.profile.ui.ProfileActivity
import com.ikramsapplication.app.modules.sidemenu.`data`.viewmodel.SideMenuVM
import kotlin.String
import kotlin.Unit

class SideMenuActivity : BaseActivity<ActivitySideMenuBinding>(R.layout.activity_side_menu) {
  private val viewModel: SideMenuVM by viewModels<SideMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sideMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtViewProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIDE_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SideMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
