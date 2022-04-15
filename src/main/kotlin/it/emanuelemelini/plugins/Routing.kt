package it.emanuelemelini.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.emanuelemelini.responses.MessageResponse
import it.emanuelemelini.routes.copyPastaRouting
import it.emanuelemelini.routes.groupRouting
import it.emanuelemelini.routes.loginRouting
import it.emanuelemelini.routes.userRouting

fun Application.configureRouting() {

    routing {
        userRouting()
        loginRouting()
        copyPastaRouting()
        groupRouting()
    }

}
