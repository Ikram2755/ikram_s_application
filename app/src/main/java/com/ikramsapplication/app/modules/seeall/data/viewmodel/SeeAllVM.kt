package com.ikramsapplication.app.modules.seeall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.seeall.`data`.model.GridlocationEightRowModel
import com.ikramsapplication.app.modules.seeall.`data`.model.GridlocationRowModel
import com.ikramsapplication.app.modules.seeall.`data`.model.SeeAllModel
import com.ikramsapplication.app.modules.seeall.`data`.model.SeeAllRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SeeAllVM : ViewModel(), KoinComponent {
  val seeAllModel: MutableLiveData<SeeAllModel> = MutableLiveData(SeeAllModel())

  var navArguments: Bundle? = null

  val gridlocationList: MutableLiveData<MutableList<GridlocationRowModel>> =
      MutableLiveData(mutableListOf())

  val seeAllList: MutableLiveData<MutableList<SeeAllRowModel>> = MutableLiveData(mutableListOf())

  val gridlocationEightList: MutableLiveData<MutableList<GridlocationEightRowModel>> =
      MutableLiveData(mutableListOf())
}
