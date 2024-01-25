package com.ikramsapplication.app.modules.favourite.`data`.model

import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavouriteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavourite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favourite)

)
