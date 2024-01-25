package com.ikramsapplication.app.modules.upload.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_duration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServing: String? = MyApp.getInstance().resources.getString(R.string.lbl_serving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_video)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtySixValue: String? = null
)
