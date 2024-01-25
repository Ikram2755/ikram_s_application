package com.ikramsapplication.app.modules.video.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityVideoBinding
import com.ikramsapplication.app.modules.video.`data`.viewmodel.VideoVM
import kotlin.String
import kotlin.Unit

class VideoActivity : BaseActivity<ActivityVideoBinding>(R.layout.activity_video) {
  private val viewModel: VideoVM by viewModels<VideoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.videoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
