package school.cactus.cactusnotesmvvmsample

class UsernameValidator {
    fun validate(username: String?) = when {
        username == null -> getString(R.string.error_username_blank)
        username.isBlank() -> getString(R.string.error_username_blank)
        username.length < 3 -> getString(R.string.error_username_length)
        !username.containsValidCharacters() -> getString(R.string.error_username_invalid)
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}