package com.ikramsapplication.app.modules.upload.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.upload.`data`.model.UploadModel
import org.koin.core.KoinComponent

class UploadVM : ViewModel(), KoinComponent {
  val uploadModel: MutableLiveData<UploadModel> = MutableLiveData(UploadModel())

  var navArguments: Bundle? = null
}
