package com.ikramsapplication.app.modules.recipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ikramsapplication.app.modules.recipe.`data`.model.RecipeModel
import org.koin.core.KoinComponent

class RecipeVM : ViewModel(), KoinComponent {
  val recipeModel: MutableLiveData<RecipeModel> = MutableLiveData(RecipeModel())

  var navArguments: Bundle? = null
}
