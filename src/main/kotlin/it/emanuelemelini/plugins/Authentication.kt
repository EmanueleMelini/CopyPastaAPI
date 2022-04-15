package it.emanuelemelini.plugins

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.responses.MessageResponse
import it.emanuelemelini.routes.copyPastaRouting
import it.emanuelemelini.routes.groupRouting
import it.emanuelemelini.routes.loginRouting
import it.emanuelemelini.routes.userRouting
import java.util.*

fun Application.configureAuthentication() {
    val secret = environment.config.property("jwt.secret").getString()
    val issuer = environment.config.property("jwt.issuer").getString()
    val audience = environment.config.property("jwt.audience").getString()
    val myRealm = environment.config.property("jwt.realm").getString()
    install(Authentication) {
        jwt("auth-jwt") {
            realm = myRealm
            val postsecret = Base64.getEncoder().encodeToString(secret.toByteArray()) ?: "DEFAULT_SECRET\$KEY,FOR-JWT/ENCODING"
            verifier(
                JWT.require(Algorithm.HMAC256(postsecret))
                    .withAudience(audience)
                    .withIssuer(issuer)
                    .build()
            )
            validate { jwtCredential ->
                if (jwtCredential.payload.getClaim("IDuser").asString() != "" &&
                    jwtCredential.payload.getClaim("IDgroup").asString() != "" &&
                    jwtCredential.payload.getClaim("admin").asString() != "")
                    JWTPrincipal(jwtCredential.payload)
                else
                    null
            }
            challenge { defaultScheme, realm ->
                call.respond(MessageResponse(104, "Missing, invalid or expired token"))
            }
        }
    }
}
