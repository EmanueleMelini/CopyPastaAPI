package it.emanuelemelini.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val IDuser: Int,
    val username: String,
    val password: String,
    val IDgroup: Int,
    val groupAdmin: Boolean,
    val admin: Boolean,
    val deleted: Boolean
)

val userStorage = listOf(
    User(
        1,
        "e.melini",
        "test2022",
        1,
        groupAdmin = true,
        admin = true,
        deleted = false
    ),
    User(
        2,
        "e.scaccia",
        "test2020",
        1,
        groupAdmin = false,
        admin = false,
        deleted = false
    )
)