package school.cactus.cactusnotesmvvmsample

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import java.lang.ref.WeakReference


class SignupViewModel(application: Application) : AndroidViewModel(application) {
    private var applicationContext = application.applicationContext

    // State
    val email = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val emailError = MutableLiveData<String>()
    val usernameError = MutableLiveData<String>()
    val passwordError = MutableLiveData<String>()


    private val emailValidator = EmailValidator(applicationContext)
    private val usernameValidator = UsernameValidator(applicationContext)
    private val passwordValidator = PasswordValidator(applicationContext)

    fun onSignupButtonClick() {
        emailError.value = emailValidator.validate(email.value)
        usernameError.value = usernameValidator.validate(username.value)
        passwordError.value = passwordValidator.validate(password.value)
    }
}