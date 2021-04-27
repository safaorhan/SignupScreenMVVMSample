package school.cactus.cactusnotesmvvmsample

import android.content.Context

class UsernameValidator(var context: Context) {

    fun validate(username: String?) = when {
        username == null -> context.getString(R.string.username_cannot_be_empty)
        username.isBlank() -> context.getString(R.string.username_cannot_be_empty)
        username.length < 3 -> context.getString(R.string.username_cannot_be_short)
        !username.containsValidCharacters() -> context.getString(R.string.username_invalid)
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}