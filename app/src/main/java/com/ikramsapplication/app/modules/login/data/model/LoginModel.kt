package com.ikramsapplication.app.modules.login.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
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
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotRegistered: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_registered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisterNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_register_now)

)
