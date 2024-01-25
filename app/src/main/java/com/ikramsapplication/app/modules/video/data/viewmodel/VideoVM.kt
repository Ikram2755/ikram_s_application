package com.ikramsapplication.app.modules.video.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.video.`data`.model.VideoModel
import org.koin.core.KoinComponent

class VideoVM : ViewModel(), KoinComponent {
  val videoModel: MutableLiveData<VideoModel> = MutableLiveData(VideoModel())

  var navArguments: Bundle? = null
}
