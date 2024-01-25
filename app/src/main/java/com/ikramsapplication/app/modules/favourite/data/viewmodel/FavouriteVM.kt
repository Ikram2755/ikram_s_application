package com.ikramsapplication.app.modules.favourite.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.favourite.`data`.model.AdapterseventyRowModel
import com.ikramsapplication.app.modules.favourite.`data`.model.FavouriteModel
import com.ikramsapplication.app.modules.favourite.`data`.model.ListlocationSixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FavouriteVM : ViewModel(), KoinComponent {
  val favouriteModel: MutableLiveData<FavouriteModel> = MutableLiveData(FavouriteModel())

  var navArguments: Bundle? = null

  val adapterseventyList: MutableLiveData<MutableList<AdapterseventyRowModel>> =
      MutableLiveData(mutableListOf())

  val listlocationSixList: MutableLiveData<MutableList<ListlocationSixRowModel>> =
      MutableLiveData(mutableListOf())
}
