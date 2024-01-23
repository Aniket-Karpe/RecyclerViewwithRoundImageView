package com.aniket.mvvmpatternscaler;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    //private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        observeUserData()
        loadUserData()
    }

    private fun observeUserData() {
     //   viewModel.user.observe(this, Observer { user ->
            // Update the UI with the user data
        ///    textViewId.text = user.id
          //  textViewName.text = user.name
            //textViewEmail.text = user.email
      //  })
    }

    private fun loadUserData() {
       // viewModel.loadUser()
    }
}

