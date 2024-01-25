package com.ikramsapplication.app.modules.home.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_denny)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatwouldyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_would_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaysFreshR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_today_s_fresh_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended: String? = MyApp.getInstance().resources.getString(R.string.lbl_recommended)

)
