package it.emanuelemelini.responses

import kotlinx.serialization.Serializable

@Serializable
data class MessageResponse(val error: Int, val message: String)