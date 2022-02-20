package finserver.tomato.com.routes

import finserver.tomato.com.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.0.167:8080"
private val rabbits = listOf(
    Rabbit("Emma", "Simple hard destroyer rabbit", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Carl", "Kind and cute rabbit", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Stown", "The king of all rabbits", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Smith", "Mega super rabbtinio", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Elithabet", "Rabbit - inhabit", "$BASE_URL/rabbits/rabbit5.jpg"),
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}
