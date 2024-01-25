package com.ikramsapplication.app.modules.filter.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReset: String? = MyApp.getInstance().resources.getString(R.string.lbl_reset)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeal: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCourse: String? = MyApp.getInstance().resources.getString(R.string.lbl_course)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSoup: String? = MyApp.getInstance().resources.getString(R.string.lbl_soup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSide: String? = MyApp.getInstance().resources.getString(R.string.lbl_side)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServing: String? = MyApp.getInstance().resources.getString(R.string.lbl_serving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetManually: String? = MyApp.getInstance().resources.getString(R.string.lbl_set_manually)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreparationTim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_preparation_tim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetManuallyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_set_manually)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMainValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDessertValue: String? = null
)
