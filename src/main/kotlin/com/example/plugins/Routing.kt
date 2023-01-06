package com.example.plugins
import com.example.routes.getAllCharacters
import com.example.routes.root
import com.example.routes.searchCharacters
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
         root()
        getAllCharacters()
        searchCharacters()
        static("/images") {
            resources("images")
        }
    }
}
