package com.ikramsapplication.app.modules.video.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VideoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_french_toast_wi)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDirections: String? = MyApp.getInstance().resources.getString(R.string.lbl_directions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
