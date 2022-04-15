package it.emanuelemelini.responses

import it.emanuelemelini.model.Group
import kotlinx.serialization.Serializable

@Serializable
data class GroupResponse(
    val error: Int,
    val message: String,
    val groups: Array<Group>?
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GroupResponse

        if (error != other.error) return false
        if (message != other.message) return false
        if (groups != null) {
            if (other.groups == null) return false
            if (!groups.contentEquals(other.groups)) return false
        } else if (other.groups != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = error
        result = 31 * result + message.hashCode()
        result = 31 * result + (groups?.contentHashCode() ?: 0)
        return result
    }

}