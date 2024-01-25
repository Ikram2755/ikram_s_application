package com.ikramsapplication.app.modules.seeall.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SeeAllModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaysFreshR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_today_s_fresh_r)

)
