package school.cactus.cactusnotesmvvmsample

class EmailValidator {
    fun validate(email: String?) = when {
        email == null -> R.string.error_email_blank
        email.isBlank() -> R.string.error_email_blank
        email.length < 5 -> R.string.error_email_length
        !email.contains("@")
                || !email.contains(".") -> R.string.error_email_invalid
        else -> 0
    }
}