package com.ikramsapplication.app.modules.recipedetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.recipedetail.`data`.model.RecipeDetailModel
import org.koin.core.KoinComponent

class RecipeDetailVM : ViewModel(), KoinComponent {
  val recipeDetailModel: MutableLiveData<RecipeDetailModel> = MutableLiveData(RecipeDetailModel())

  var navArguments: Bundle? = null
}
