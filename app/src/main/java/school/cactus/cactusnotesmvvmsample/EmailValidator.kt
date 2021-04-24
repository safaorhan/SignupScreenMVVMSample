package school.cactus.cactusnotesmvvmsample

import android.content.Context
import android.content.res.Resources

class EmailValidator{

    fun validate(email: String?) = when {
        email == null -> R.string.email_error_msg_1
        email.isBlank() -> R.string.email_error_msg_1
        email.length < 5 -> R.string.email_error_msg_2
        !email.contains("@")
                || !email.contains(".") -> R.string.email_error_msg_3
        else -> null
    }
}