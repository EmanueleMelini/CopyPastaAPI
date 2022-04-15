package it.emanuelemelini.routes

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.model.copyPastaStorage
import it.emanuelemelini.model.groupStorage
import it.emanuelemelini.model.userStorage
import it.emanuelemelini.responses.CopyPastaResponse
import it.emanuelemelini.responses.GroupResponse
import java.util.*

fun Route.copyPastaRouting() {

    route("/copy") {

        get("/all") {
            if (copyPastaStorage.isNullOrEmpty())
                call.respond(CopyPastaResponse(1, "No CopyPasta found", null))
            else
                call.respond(CopyPastaResponse(0, "CopyPastas found", copyPastaStorage.toTypedArray()))
        }

        get("{IDcopy?}") {
            try {
                val id = (call.parameters["IDcopy"] ?: return@get call.respond(CopyPastaResponse(1, "Missing parameters", null))).toInt()
                val copy = copyPastaStorage.find {
                    it.IDcopy == id && !it.deleted
                } ?: return@get call.respond(CopyPastaResponse(2, "No CopyPasta found with IDcopy $id", null))
                call.respond(CopyPastaResponse(0, "CopyPasta found", arrayOf(copy)))
            } catch (e: Exception) {
                return@get call.respond(CopyPastaResponse(3, "Bad parameter", null))
            }
        }

        authenticate("auth-jwt") {
            get("/group") {

                val principal = call.principal<JWTPrincipal>() ?: return@get call.respond(CopyPastaResponse(1, "Invalid token", null))
                val id = principal.payload.getClaim("IDuser").asInt() ?: return@get call.respond(CopyPastaResponse(1, "Invalid token", null))
                val idgroup = principal.payload.getClaim("IDgroup").asInt() ?: return@get call.respond(CopyPastaResponse(1, "Invalid token", null))
                val admin = principal.payload.getClaim("admin").asBoolean() ?: return@get call.respond(CopyPastaResponse(1, "Invalid token", null))
                val expiresAt = Date(principal.expiresAt?.time ?: return@get call.respond(CopyPastaResponse(1, "Invalid token", null)))
                println("IDuser: $id - IDgroup: $idgroup - admin: $admin - expiresAt: $expiresAt")
                try {

                    val user = userStorage.find {
                        it.IDuser == id && !it.deleted && it.IDgroup == idgroup && it.admin == admin
                    } ?: return@get call.respond(CopyPastaResponse(2, "No User found with IDuser $id", null))

                    val copys = copyPastaStorage.filter {
                        (!user.admin && it.IDgroup == user.IDgroup && !it.deleted) || (user.admin && !it.deleted)
                    }

                    if (copys.isEmpty())
                        return@get call.respond(CopyPastaResponse(3, "No CopyPasta found for User with IDuser $id and Group with IDgroup $idgroup", null))

                    call.respond(CopyPastaResponse(0, "Group found", copys.toTypedArray()))

                } catch (e: Exception) {
                    e.printStackTrace()
                    return@get call.respond(CopyPastaResponse(4, "Bad parameter - ${e.message}", null))
                }

            }
        }

    }

}