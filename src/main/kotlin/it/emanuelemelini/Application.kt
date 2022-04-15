package it.emanuelemelini

import io.ktor.server.application.*
import it.emanuelemelini.plugins.configureAuthentication
import it.emanuelemelini.plugins.configureCORS
import it.emanuelemelini.plugins.configureRouting
import it.emanuelemelini.plugins.configureSerialization

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {

    configureRouting()
    configureSerialization()
    configureAuthentication()
    configureCORS()

}