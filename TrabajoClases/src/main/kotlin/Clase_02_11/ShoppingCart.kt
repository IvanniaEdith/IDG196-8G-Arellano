package Clase_02_11

data class ShoppingCart (
    val buyDate : String,
    val customer: Customer
){
    val products: ArrayList<Product> = arrayListOf()
}