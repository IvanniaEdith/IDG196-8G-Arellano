package xm.ude.sytec.onallera.ainnavi

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.auth.*
import com.fasterxml.jackson.databind.*
import io.ktor.jackson.*
import io.ktor.features.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(Authentication) {
    }

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    install(CORS) {
        method(HttpMethod.Options)
        method(HttpMethod.Put)
        method(HttpMethod.Delete)
        method(HttpMethod.Patch)
        header(HttpHeaders.Authorization)
        header("MyCustomHeader")
        allowCredentials = true
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }

    val customer = Customer("Ivannia", "ivannia@gmail.com", 150)
    val product = Product("basta", 50, "55555555")
    val cart = customer.ShoppingCart
    val ShoppingCartBehavior = ShoppingCartBehavior(cart)
    ShoppingCartBehavior.addProduct(product, 3)
    val change = customer.money - ShoppingCartBehavior.getTotal()

    routing {

        get("/Customer") {
            call.respond(mapOf("name" to customer.name))
        }

        get("/Total") {
            call.respond(mapOf("total" to ShoppingCartBehavior.getTotal()))
        }

        get("/Producto") {
            call.respond(mapOf("producto" to customer.ShoppingCart.products))
        }

        get("/Cambio") {
            call.respond(mapOf("cambio" to change))
        }
    }
}

