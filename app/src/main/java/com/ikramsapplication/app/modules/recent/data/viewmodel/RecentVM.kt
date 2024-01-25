package com.ikramsapplication.app.modules.recent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.recent.`data`.model.RecentModel
import com.ikramsapplication.app.modules.recent.`data`.model.RecentRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecentVM : ViewModel(), KoinComponent {
  val recentModel: MutableLiveData<RecentModel> = MutableLiveData(RecentModel())

  var navArguments: Bundle? = null

  val recentList: MutableLiveData<MutableList<RecentRowModel>> = MutableLiveData(mutableListOf())
}
