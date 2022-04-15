package it.emanuelemelini.responses

import it.emanuelemelini.model.User
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val error: Int,
    val message: String,
    val users: Array<User>?
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserResponse

        if (error != other.error) return false
        if (message != other.message) return false
        if (users != null) {
            if (other.users == null) return false
            if (!users.contentEquals(other.users)) return false
        } else if (other.users != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = error
        result = 31 * result + message.hashCode()
        result = 31 * result + (users?.contentHashCode() ?: 0)
        return result
    }

}