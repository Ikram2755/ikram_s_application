package com.ikramsapplication.app.modules.recommended.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridlocationEight1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfastFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToastwithBerrFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_toast_with_berr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_03)

)
