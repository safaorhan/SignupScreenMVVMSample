package school.cactus.cactusnotesmvvmsample

class PasswordValidator {
    fun validate(password: String?) = when {
        password == null -> "Password cannot be empty"
        password.isBlank() -> "Password cannot be empty"
        password.length < 8 -> "Password cannot be this short"
        !password.containsRequiredCharacters() -> "Password should contain one lowercase, one uppercase, one digit, one spec char"
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
