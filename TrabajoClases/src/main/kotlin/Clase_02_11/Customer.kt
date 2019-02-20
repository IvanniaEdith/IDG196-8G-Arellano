package Clase_02_11

data class Customer(
    val name: String,
    val email: String
) {
    val payments: ArrayList<Payment> = arrayListOf()
    var ShoppingCart: ShoppingCart = ShoppingCart ("")
}