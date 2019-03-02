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
import kotlin.test.*
import io.ktor.server.testing.*

class ApplicationTest {

    @Test
    fun testname() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/Customer").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun testTotal() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/Total").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun testProducto() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/Producto").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun testCambio() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/Cambio").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

}
