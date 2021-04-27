package school.cactus.cactusnotesmvvmsample

import android.R
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SignupViewModel(application: Application) : AndroidViewModel(application) {
    private val context = application.applicationContext
    // State
    val email = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val emailError = MutableLiveData<String>()
    val usernameError = MutableLiveData<String>()
    val passwordError = MutableLiveData<String>()


    private val emailValidator = EmailValidator(context)
    private val usernameValidator = UsernameValidator(context)
    private val passwordValidator = PasswordValidator(context)

    fun onSignupButtonClick() {
        emailError.value = emailValidator.validate(email.value)
        usernameError.value = usernameValidator.validate(username.value)
        passwordError.value = passwordValidator.validate(password.value)
    }
}