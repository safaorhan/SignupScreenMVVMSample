package school.cactus.cactusnotesmvvmsample

import android.content.Context

class UsernameValidator(var applicationContext: Context) {

    fun validate(username: String?) = when {
        username == null -> applicationContext.getString(R.string.username_cannot_be_empty)
        username.isBlank() -> applicationContext.getString(R.string.username_cannot_be_empty)
        username.length < 3 -> applicationContext.getString(R.string.username_cannot_be_short)
        !username.containsValidCharacters() -> applicationContext.getString(R.string.username_invalid)
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}