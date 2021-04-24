package school.cactus.cactusnotesmvvmsample

import android.R
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SignupViewModel(application: Application) : AndroidViewModel(application) {
    private val context = getApplication<Application>().applicationContext
    // State
    val email = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val emailError = MutableLiveData<String>()
    val usernameError = MutableLiveData<String>()
    val passwordError = MutableLiveData<String>()


    private val emailValidator = EmailValidator()
    private val usernameValidator = UsernameValidator()
    private val passwordValidator = PasswordValidator()

    fun onSignupButtonClick() {
        emailError.value = context.getString(emailValidator.validate(email.value)!!)
        usernameError.value = context.getString(usernameValidator.validate(username.value)!!)
        passwordError.value = context.getString(passwordValidator.validate(password.value)!!)
    }
}