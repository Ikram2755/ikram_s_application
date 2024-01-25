package com.ikramsapplication.app.modules.recent.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecentRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlueberryMuffi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blueberry_muffi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaloriesCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_120_calories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServingCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_serving)

)
