package it.emanuelemelini.responses

import it.emanuelemelini.model.User
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val error: Int,
    val message: String,
    val user: User?,
    val token: String?
)