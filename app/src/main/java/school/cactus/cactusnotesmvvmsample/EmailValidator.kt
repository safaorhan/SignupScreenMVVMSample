package school.cactus.cactusnotesmvvmsample

import android.content.res.Resources

class EmailValidator {
    fun validate(email: String?) = when {
        email == null -> Resources.getSystem().getString(R.string.email_error_msg_1)
        email.isBlank() -> Resources.getSystem().getString(R.string.email_error_msg_1)
        email.length < 5 -> Resources.getSystem().getString(R.string.email_error_msg_2)
        !email.contains("@")
                || !email.contains(".") -> Resources.getSystem().getString(R.string.email_error_msg_3)
        else -> null
    }
}