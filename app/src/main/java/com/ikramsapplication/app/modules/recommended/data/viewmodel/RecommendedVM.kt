package com.ikramsapplication.app.modules.recommended.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.recommended.`data`.model.Gridlocation1RowModel
import com.ikramsapplication.app.modules.recommended.`data`.model.GridlocationEight1RowModel
import com.ikramsapplication.app.modules.recommended.`data`.model.RecommendedModel
import com.ikramsapplication.app.modules.recommended.`data`.model.RecommendedRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecommendedVM : ViewModel(), KoinComponent {
  val recommendedModel: MutableLiveData<RecommendedModel> = MutableLiveData(RecommendedModel())

  var navArguments: Bundle? = null

  val gridlocationList: MutableLiveData<MutableList<Gridlocation1RowModel>> =
      MutableLiveData(mutableListOf())

  val recommendedList: MutableLiveData<MutableList<RecommendedRowModel>> =
      MutableLiveData(mutableListOf())

  val gridlocationEightList: MutableLiveData<MutableList<GridlocationEight1RowModel>> =
      MutableLiveData(mutableListOf())
}
