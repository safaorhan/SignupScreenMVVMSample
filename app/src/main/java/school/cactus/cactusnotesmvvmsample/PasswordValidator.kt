package school.cactus.cactusnotesmvvmsample

class PasswordValidator {
    fun validate(password: String?) = when {
        password == null -> getString(R.string.error_password_blank)
        password.isBlank() -> getString(R.string.error_password_blank)
        password.length < 8 -> getString(R.string.error_password_length)
        !password.containsRequiredCharacters() -> getString(R.string.error_password_invalid)
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
