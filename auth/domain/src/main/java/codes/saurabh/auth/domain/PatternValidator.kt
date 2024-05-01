package codes.saurabh.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}