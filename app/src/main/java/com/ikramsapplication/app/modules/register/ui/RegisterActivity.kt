package com.ikramsapplication.app.modules.register.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import com.ikramsapplication.app.R
import com.ikramsapplication.app.appcomponents.base.BaseActivity
import com.ikramsapplication.app.databinding.ActivityRegisterBinding
import com.ikramsapplication.app.modules.home.ui.HomeActivity
import com.ikramsapplication.app.modules.login.ui.LoginActivity
import com.ikramsapplication.app.modules.register.`data`.model.RegisterRowModel
import com.ikramsapplication.app.modules.register.`data`.viewmodel.RegisterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val registerAdapter = RegisterAdapter(viewModel.registerList.value?:mutableListOf())
    binding.recyclerRegister.adapter = registerAdapter
    registerAdapter.setOnItemClickListener(
    object : RegisterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RegisterRowModel) {
        onClickRecyclerRegister(view, position, item)
      }
    }
    )
    viewModel.registerList.observe(this) {
      registerAdapter.updateData(it)
    }
    binding.registerVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.txtLoginNow.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnRegisterOne.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerRegister(
      view: View,
      position: Int,
      item: RegisterRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "REGISTER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RegisterActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
