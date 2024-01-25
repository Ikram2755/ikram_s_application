package com.ikramsapplication.app.modules.recipe.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecipeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_french_toast_wi)
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
