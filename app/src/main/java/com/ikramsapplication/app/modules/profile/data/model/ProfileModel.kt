package com.ikramsapplication.app.modules.profile.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)

)
