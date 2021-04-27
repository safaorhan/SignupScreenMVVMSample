package school.cactus.cactusnotesmvvmsample

import android.content.Context
import java.lang.ref.WeakReference

class EmailValidator(var applicationContext: Context){

    fun validate(email: String?) = when {
        email == null -> applicationContext.getString(R.string.email_cannot_be_empty)
        email.isBlank() -> applicationContext.getString(R.string.email_cannot_be_empty)
        email.length < 5 -> applicationContext.getString(R.string.email_cannot_be_short)
        !email.contains("@")
                || !email.contains(".") -> applicationContext.getString(R.string.email_invalid)
        else -> null
    }
}