package school.cactus.cactusnotesmvvmsample

import android.content.res.Resources

class UsernameValidator {

    fun validate(username: String?) = when {
        username == null ->  Resources.getSystem().getString(R.string.error_msg_1)
        username.isBlank() -> Resources.getSystem().getString(R.string.error_msg_1)
        username.length < 3 -> Resources.getSystem().getString(R.string.error_msg_2)
        !username.containsValidCharacters() -> Resources.getSystem().getString(R.string.error_msg_3)
        else -> null
    }

    private fun String.containsValidCharacters() = all {
        it.isLowerCase() || it.isDigit() || it == '_'
    }
}