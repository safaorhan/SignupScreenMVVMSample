package school.cactus.cactusnotesmvvmsample

class EmailValidator {
    fun validate(email: String?) = when {
        email == null -> "Email cannot be empty"
        email.isBlank() -> "Email cannot be empty"
        email.length < 5 -> "Email cannot be this short"
        !email.contains("@")
                || !email.contains(".") -> "Invalid email"
        else -> null
    }
}