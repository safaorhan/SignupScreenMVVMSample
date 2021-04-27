package school.cactus.cactusnotesmvvmsample

class UsernameValidator {
    fun validate(username: String?) = when {
        username == null -> R.string.error_username_blank
        username.isBlank() -> R.string.error_username_blank
        username.length < 3 -> R.string.error_username_length
        !username.containsValidCharacters() -> R.string.error_username_invalid
        else -> 0
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}