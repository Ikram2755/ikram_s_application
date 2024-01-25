package com.ikramsapplication.app.modules.register.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKHANARECIPE: String? = MyApp.getInstance().resources.getString(R.string.lbl_khana_recipe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCookineasywa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cook_in_easy_wa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyRegiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_now)

)
