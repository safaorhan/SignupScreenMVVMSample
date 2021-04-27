package school.cactus.cactusnotesmvvmsample

import android.content.Context

class PasswordValidator(var applicationContext: Context) {

    fun validate(password: String?) = when {
        password == null -> applicationContext.getString(R.string.password_cannot_empty)
        password.isBlank() -> applicationContext.getString(R.string.password_cannot_empty)
        password.length < 8 -> applicationContext.getString(R.string.password_cannot_be_short)
        !password.containsRequiredCharacters() -> applicationContext.getString(R.string.password_invalid)
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
