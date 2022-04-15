package it.emanuelemelini.routes

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.model.User
import it.emanuelemelini.model.userStorage
import it.emanuelemelini.responses.LoginResponse
import java.util.*

fun Route.loginRouting() {
    val oneMinute = 60000
    val secret = environment?.config?.propertyOrNull("jwt.secret")?.getString()
    val issuer = environment?.config?.propertyOrNull("jwt.issuer")?.getString()
    val audience = environment?.config?.propertyOrNull("jwt.audience")?.getString()
    val myRealm = environment?.config?.propertyOrNull("jwt.realm")?.getString()

    route("/login") {

        get {
            return@get call.respondText("GET Method not allowed", status = HttpStatusCode.MethodNotAllowed)
        }

        post {
            try {
                call.response.status(HttpStatusCode.OK)
                val user = call.receive<User>()
                val loggedUser = userStorage.find {
                    it.username == user.username && it.password == user.password && !it.deleted
                } ?: return@post call.respond(LoginResponse(1, "Wrong credentials", null, null))
                val postsecret = Base64.getEncoder().encodeToString(secret?.toByteArray()) ?: "DEFAULT_SECRET\$KEY,FOR-JWT/ENCODING"
                println("Secret: $postsecret - ${postsecret.length}")
                val token = JWT.create()
                    .withAudience(audience)
                    .withIssuer(issuer)
                    .withClaim("IDuser", loggedUser.IDuser)
                    .withClaim("IDgroup", loggedUser.IDgroup)
                    .withClaim("admin", loggedUser.admin)
                    .withExpiresAt(Date(System.currentTimeMillis() + (oneMinute * 60)))
                    .sign(Algorithm.HMAC256(postsecret))
                call.respond(LoginResponse(0, "User '${loggedUser.username}' logged successfully", loggedUser, token))
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
                call.respond(LoginResponse(2, "Missing parameters - ${e.message}", null, null))
            }
        }

    }

}