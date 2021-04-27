package school.cactus.cactusnotesmvvmsample

import android.content.Context

class EmailValidator(var context: Context){

    fun validate(email: String?) = when {
        email == null -> context.getString(R.string.email_cannot_be_empty)
        email.isBlank() -> context.getString(R.string.email_cannot_be_empty)
        email.length < 5 -> context.getString(R.string.email_cannot_be_short)
        !email.contains("@")
                || !email.contains(".") -> context.getString(R.string.email_invalid)
        else -> null
    }
}