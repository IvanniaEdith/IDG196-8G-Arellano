package Clase_02_11

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ShoppingCartTest {
    private val name = "usb"
    private val price = 50
    private val barcode = "55555555"
    private val qty = 1
    private val product = Product(name, price, barcode, qty)
    private val shoppingCart = ShoppingCart()

    @Before
    fun setup() {
        println("Hola mundo")
        shoppingCart.products.clear()
    }

    @Test
    fun `remove product returns true if product list is empty`() {
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product, 0))
    }

    @Test
    fun `can't remove a product that does not exist`() {
        shoppingCart.products.put(product,qty)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("gorro", 100, "88888888", 1)
        assertFalse(shoppingCartBehavior.removeProduct(nonExistingProduct, 1))
    }

    @Test
    fun `remove a product that exists`() {
        shoppingCart.products.put(product,qty)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product, 9))
    }

    @Test
    fun `can add a new product if it doesn't exist`() {
        shoppingCart.products.put(product, qty)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("gorro", 100, "88888888", 1)
        assertTrue(shoppingCartBehavior.addProduct(nonExistingProduct, 1))
    }

    @Test
    fun `Total`(){
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        shoppingCart.products.put(product, 3)
        val expected= 300
        val actual = shoppingCartBehavior.getTotal()
        assertEquals(expected,actual)
    }

}