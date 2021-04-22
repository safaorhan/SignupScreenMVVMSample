package school.cactus.cactusnotesmvvmsample

class EmailValidator {
    fun validate(email: String?) = when {
        email == null -> getString(R.string.error_email_blank)
        email.isBlank() -> getString(R.string.error_email_blank)
        email.length < 5 -> getString(R.string.error_email_length)
        !email.contains("@")
                || !email.contains(".") -> getString(R.string.error_email_invalid)
        else -> null
    }
}