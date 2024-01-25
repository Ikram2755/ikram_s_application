package com.ikramsapplication.app.modules.recent.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyViewed: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_viewed)

)
