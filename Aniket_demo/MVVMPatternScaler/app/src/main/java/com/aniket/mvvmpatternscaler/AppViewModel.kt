//package com.aniket.mvvmpatternscaler
//
//import androidx.databinding.Bindable
//
//package com.aniket.mvvmpatternscaler
//import android.text.TextUtils
//import android.util.Patterns
//import androidx.databinding.BaseObservable
//import androidx.databinding.Bindable
//import androidx.databinding.ObservableField

//class AppViewModel : BaseObservable() {
//
//    // This creates an object of the Model class
//    private val model: Model = Model("", "")
//
//    // Creates string variables for
//    // toast messages
//    private val successMessage = "Login success"
//    private val errorMessage = "Entered Email-ID or Password is not valid"
//
//    // Creates ObservableField for toast message
//    val toastMessage: ObservableField<String> = ObservableField()
//  @Bindable
//    fun getUserEmail(): String? {
//        return model.email
//    }
//    // Creates getter and setter methods
//    // for email variable
//
//
//    fun setUserEmail(email: String) {
//        model.email = email
//        notifyPropertyChanged(BR.userEmail)
//    }
//
//    // Creates getter and setter methods
//    // for password variable
//    @Bindable
//    fun getUserPassword(): String? {
//        return model.password
//    }
//
//    fun setUserPassword(password: String) {
//        model.password = password
//        notifyPropertyChanged(BR.userPassword)
//    }
//
//    // Login Button Logic
//    fun onButtonClicked() {
//        if (isValid())
//            toastMessage.set(successMessage)
//        else
//            toastMessage.set(errorMessage)
//    }
//
//    // checks if the input fields are valid
//    private fun isValid(): Boolean {
//        return !TextUtils.isEmpty(getUserEmail()) &&
//                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
//                getUserPassword()?.length ?: 0 > 5
//    }
//}
//
