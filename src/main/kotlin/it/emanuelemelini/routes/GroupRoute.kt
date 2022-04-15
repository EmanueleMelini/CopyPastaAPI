package it.emanuelemelini.routes

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.model.groupStorage
import it.emanuelemelini.model.userStorage
import it.emanuelemelini.responses.GroupResponse
import java.util.*

fun Route.groupRouting() {

    route("/group") {

        get("/all") {
            if (groupStorage.isNullOrEmpty())
                call.respond(GroupResponse(1, "No Group found", null))
            else
                call.respond(GroupResponse(0, "Groups found", groupStorage.toTypedArray()))
        }

        get("?IDgroup={IDgroup?}") {
            try {
                val id = (call.parameters["IDgroup"] ?: return@get call.respond(GroupResponse(1, "Missing parameters", null))).toInt()
                val group = groupStorage.find {
                    it.IDgroup == id && !it.deleted
                } ?: return@get call.respond(GroupResponse(2, "No Group found with IDgroup $id", null))
                call.respond(GroupResponse(0, "Group found", arrayOf(group)))
            } catch (e: Exception) {
                e.printStackTrace()
                return@get call.respond(GroupResponse(3, "Bad parameter - ${e.message}", null))
            }
        }

        authenticate("auth-jwt") {
            get("/user") {
                val principal = call.principal<JWTPrincipal>() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val id = principal.payload.getClaim("IDuser").asInt() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val idgroup = principal.payload.getClaim("IDgroup").asInt() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val admin = principal.payload.getClaim("admin").asBoolean() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val expiresAt = Date(principal.expiresAt?.time ?: return@get call.respond(GroupResponse(1, "Invalid token", null)))//.minus(System.currentTimeMillis())!!)
                println("IDuser: $id - IDgroup: $idgroup - admin: $admin - expiresAt: $expiresAt")
                try {
                    val user = userStorage.find {
                        it.IDuser == id && !it.deleted
                    } ?: return@get call.respond(GroupResponse(2, "No User found with IDuser $id", null))
                    val group = groupStorage.filter {
                        (!admin && it.IDgroup == user.IDgroup && it.IDgroup == idgroup && !it.deleted) || (admin && !it.deleted)
                    }
                    if (group.isEmpty())
                        return@get call.respond(GroupResponse(3, "No Group found for User with IDuser $id", null))
                    call.respond(GroupResponse(0, "Group found", group.toTypedArray()))
                } catch (e: Exception) {
                    e.printStackTrace()
                    return@get call.respond(GroupResponse(4, "Bad parameter - ${e.message}", null))
                }
            }
        }

        authenticate("auth-jwt") {
            get("/delete/{IDgroup?}") {
                val principal = call.principal<JWTPrincipal>() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val id = principal.payload.getClaim("IDuser").asInt() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val idgroup = principal.payload.getClaim("IDgroup").asInt() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val admin = principal.payload.getClaim("admin").asBoolean() ?: return@get call.respond(GroupResponse(1, "Invalid token", null))
                val expiresAt = Date(principal.expiresAt?.time ?: return@get call.respond(GroupResponse(1, "Invalid token", null)))
                try {
                    val user = userStorage.find {
                        it.IDuser == id && !it.deleted && it.admin == admin && it.IDgroup == idgroup
                    } ?: return@get call.respond(GroupResponse(2, "No User found with IDuser $id", null))

                    val iddel = (call.parameters["IDgroup"] ?: return@get call.respond(GroupResponse(3, "Missing parameters", null))).toInt()

                    if (!user.groupAdmin && !user.admin) {
                        return@get call.respond(GroupResponse(4, "User $id can't delete group $iddel because he's not a group admin or server admin", null))
                    }

                    val group = groupStorage.find {
                        (it.IDgroup == iddel && it.IDgroup == idgroup && user.groupAdmin && !it.deleted) ||
                        (user.admin && it.IDgroup == iddel && !it.deleted)
                    } ?: return@get call.respond(GroupResponse(5, "Group $iddel not found", null))

                    //set group deleted

                    return@get call.respond(GroupResponse(0, "Group $iddel deleted", arrayOf(group)))

                } catch (e: java.lang.Exception) {
                    e.printStackTrace()
                    return@get call.respond(GroupResponse(6, "Bad parameter - ${e.message}", null))
                }
            }

        }

    }

}