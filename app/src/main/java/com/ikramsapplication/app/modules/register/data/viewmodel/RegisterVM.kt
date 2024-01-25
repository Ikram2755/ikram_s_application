package com.ikramsapplication.app.modules.register.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.register.`data`.model.RegisterModel
import com.ikramsapplication.app.modules.register.`data`.model.RegisterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RegisterVM : ViewModel(), KoinComponent {
  val registerModel: MutableLiveData<RegisterModel> = MutableLiveData(RegisterModel())

  var navArguments: Bundle? = null

  val registerList: MutableLiveData<MutableList<RegisterRowModel>> =
      MutableLiveData(mutableListOf())
}
