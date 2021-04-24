package school.cactus.cactusnotesmvvmsample

import android.content.Context
import android.content.res.Resources

class PasswordValidator {

    fun validate(password: String?) = when {
        password == null -> R.string.password_error_msg_1
        password.isBlank() -> R.string.password_error_msg_1
        password.length < 8 -> R.string.password_error_msg_2
        !password.containsRequiredCharacters() -> R.string.password_error_msg_3
        else -> null
    }

    private fun String.containsRequiredCharacters() = containsDigit()
            && containsLowerCase()
            && containsUpperCase()
            && containsSpecialCharacter()

    private fun String.containsDigit() = any { it.isDigit() }

    private fun String.containsLowerCase() = any { it.isLowerCase() }

    private fun String.containsUpperCase() = any { it.isUpperCase() }

    private fun String.containsSpecialCharacter() = any { it.isSpecialCharacter() }

    private fun Char.isSpecialCharacter() = !isDigit() && !isLetter()
}
