package school.cactus.cactusnotesmvvmsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel : ViewModel() {
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
        emailError.value = emailValidator.validate(email.value)
        usernameError.value = usernameValidator.validate(username.value)
        passwordError.value = passwordValidator.validate(password.value)
    }
}