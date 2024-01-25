package com.ikramsapplication.app.modules.favourite.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlocationSixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToastwithBerr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_toast_with_berr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_03)

)
