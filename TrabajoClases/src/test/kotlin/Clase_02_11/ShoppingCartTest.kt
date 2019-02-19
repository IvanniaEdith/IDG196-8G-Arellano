package Clase_02_11

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ShoppingCartTest {
    private val name = "credencial"
    private val price = "100"
    private val barcode = "55876397"
    private val qty = "1"
    private val product = Product(name, price, barcode, qty)
    private val customer = Customer("Jhon Wayne", "jwayne@example.com")
    private val shoppingCart = ShoppingCart(
        "12/03",
        customer
    )

    @Before
    fun setup() {
        println("its a me setup")
        shoppingCart.products.clear()
    }

    @Test
    fun `remove product returns true if product list is empty`() {
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product))
    }

    @Test
    fun `can't remove a product that does not exist`() {
        shoppingCart.products.add(product)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("carta", "150", "34566432", "1")
        assertFalse(shoppingCartBehavior.removeProduct(nonExistingProduct))
    }

    @Test
    fun `remove a product that exists`() {
        shoppingCart.products.add(product)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product))
    }


    @Test
    fun `can add a new product if it doesn't exist`() {
        shoppingCart.products.add(product)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("bolsa", "200", "99966782", "1")
        assertFalse(shoppingCartBehavior.addProduct(nonExistingProduct))
    }

    @Test
    fun `can replace customer if is different than the existent`() {
        setOf<Customer>()

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingCustomer = Customer("Ivannia", "ivannia@example.com")
        assertTrue(shoppingCartBehavior.setCustomer(nonExistingCustomer))
    }
    @Test
    fun `can't replace customer if is the same than the existent`() {
        setOf<Customer>()

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingCustomer = Customer("Jhon Wayne", "jwayne@example.com")
        assertFalse(shoppingCartBehavior.setCustomer(nonExistingCustomer))
    }
}