package it.emanuelemelini.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.cors.*

fun Application.configureCORS() {

    install(CORS) {
        allowHost("localhost:8081", schemes = listOf("http", "https"))
        allowHost("192.168.1.43:8081", schemes = listOf("http", "https"))
        allowHeader(HttpHeaders.ContentType)
        allowHeader(HttpHeaders.Authorization)
        allowCredentials = true
    }

}