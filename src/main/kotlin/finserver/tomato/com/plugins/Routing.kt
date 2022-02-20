package finserver.tomato.com.plugins

import finserver.tomato.com.routes.randomRabbit
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {
        randomRabbit()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
