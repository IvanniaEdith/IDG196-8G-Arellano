package xm.ude.sytec.onallera.ainnavi

data class Customer(
    val name: String,
    val email: String,
    val money: Int
) {
    val payments: ArrayList<Payment> = arrayListOf()
    var ShoppingCart: ShoppingCart = ShoppingCart ()
}