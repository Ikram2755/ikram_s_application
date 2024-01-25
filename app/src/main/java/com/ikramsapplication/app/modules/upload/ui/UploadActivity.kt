package com.ikramsapplication.app.modules.upload.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityUploadBinding
import com.ikramsapplication.app.modules.profile.ui.ProfileActivity
import com.ikramsapplication.app.modules.upload.`data`.viewmodel.UploadVM
import kotlin.String
import kotlin.Unit

class UploadActivity : BaseActivity<ActivityUploadBinding>(R.layout.activity_upload) {
  private val viewModel: UploadVM by viewModels<UploadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.uploadVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupThirtyEight.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
