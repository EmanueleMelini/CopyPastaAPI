package it.emanuelemelini.model

import kotlinx.serialization.Serializable

@Serializable
data class Group(
    val IDgroup: Int,
    val name: String,
    val description: String,
    val deleted: Boolean
)

val groupStorage = listOf(
    Group(
        1,
        "EXP",
        "Experimental Players's group",
        false
    ),
    Group(
        2,
        "MANIP",
        "MANIP FOREVER",
        false
    )
)