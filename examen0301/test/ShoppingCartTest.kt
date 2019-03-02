package xm.ude.sytec.onallera.ainnavi

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ShoppingCartTest {
    private val name = "basta"
    private val price = 50
    private val barcode = "55555555"
    private val qty = 1
    private val product = Product(name, price, barcode)
    private val shoppingCart = ShoppingCart()
    private val changecart = ChangeCart ()
    private val customer = Customer(name, "ivannia.com", 150)

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
        val nonExistingProduct = Product("basta", 100, "88888888")
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
        val nonExistingProduct = Product("basta", 100, "88888888")
        assertTrue(shoppingCartBehavior.addProduct(nonExistingProduct, 1))
    }

    @Test
    fun `Total`(){
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        shoppingCart.products.put(product, 3)
        val expected= 150
        val actual = shoppingCartBehavior.getTotal()
        assertEquals(expected,actual)
    }

    @Test
    fun `Change`(){
        val changecartbehavior = ChangeCartBehavior(changecart)
        val expected = changecartbehavior.getChange() > 0
        val actual = changecartbehavior.getChange()
    }

    @Test
    fun `can add money`() {
        changecart.moneda.put(5, 2)
        val ChangeCartBehavior = ChangeCartBehavior(changecart)
        assertTrue(ChangeCartBehavior.addMoney(5, 2))
    }

}