package com.ikramsapplication.app.modules.seeall.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SeeAllRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfastThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToastwithBerrThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_toast_with_berr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_03)

)
