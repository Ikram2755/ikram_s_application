package com.ikramsapplication.app.modules.home.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecomendedRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChocolateCake: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chocolate_cake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_03)

)
