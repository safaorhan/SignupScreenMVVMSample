package school.cactus.cactusnotesmvvmsample

import android.content.Context
import android.content.res.Resources

class UsernameValidator {

    fun validate(username: String?) = when {
        username == null -> R.string.error_msg_1
        username.isBlank() -> R.string.error_msg_1
        username.length < 3 -> R.string.error_msg_2
        !username.containsValidCharacters() -> R.string.error_msg_3
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}