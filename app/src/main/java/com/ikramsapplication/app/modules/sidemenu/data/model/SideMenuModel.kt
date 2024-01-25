package com.ikramsapplication.app.modules.sidemenu.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SideMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDenny: String? = MyApp.getInstance().resources.getString(R.string.lbl_denny)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavourite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favourite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
