package school.cactus.cactusnotesmvvmsample

class EmailValidator {
    fun validate(email: String?) = when {
        email == null -> getString(R.string.email_error_msg_1)
        email.isBlank() -> getString(R.string.email_error_msg_1)
        email.length < 5 -> getString(R.string.email_error_msg_2)
        !email.contains("@")
                || !email.contains(".") -> getString(R.string.email_error_msg_3)
        else -> null
    }
}