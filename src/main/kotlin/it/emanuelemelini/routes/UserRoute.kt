package it.emanuelemelini.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.model.userStorage
import it.emanuelemelini.responses.UserResponse

fun Route.userRouting() {

    route("/user") {

        get("/all") {
            if (userStorage.isNullOrEmpty())
                call.respond(UserResponse(1, "No User found", null))
            else
                call.respond(UserResponse(0, "Users found", userStorage.toTypedArray()))
        }

        get("{IDuser?}") {
            try {
                val id = (call.parameters["IDuser"] ?: return@get call.respond(UserResponse(1, "Missing parameters", null))).toInt()
                val user = userStorage.find {
                    it.IDuser == id && !it.deleted
                } ?: return@get call.respond(UserResponse(2, "No User found with IDuser $id", null))
                call.respond(UserResponse(0, "User found", arrayOf(user)))
            } catch (e: Exception) {
                return@get call.respond(UserResponse(3, "Bad parameter", null))
            }
        }

    }

}