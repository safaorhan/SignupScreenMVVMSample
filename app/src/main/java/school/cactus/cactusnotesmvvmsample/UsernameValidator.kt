package school.cactus.cactusnotesmvvmsample

class UsernameValidator {
    fun validate(username: String?) = when {
        username == null ->  getString(R.string.error_msg_1)
        username.isBlank() -> getString(R.string.error_msg_1)
        username.length < 3 -> getString(R.string.error_msg_2)
        !username.containsValidCharacters() -> getString(R.string.error_msg_3)
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}