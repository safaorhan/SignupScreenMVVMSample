package school.cactus.cactusnotesmvvmsample

import android.content.Context
import android.content.res.Resources
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel(private val context: Context) : ViewModel() {
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


        emailError.value = try { context.getString(emailValidator.validate(email.value)) } catch (e: Resources.NotFoundException) { null }
        usernameError.value = try { context.getString(usernameValidator.validate(username.value))} catch (e: Resources.NotFoundException) { null }
        passwordError.value = try { context.getString(passwordValidator.validate(password.value)) } catch (e: Resources.NotFoundException) { null }
    }

}