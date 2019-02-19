package Clase_02_11

class ShoppingCartBehavior (private val shoppingCart: ShoppingCart){
    fun removeProduct(product: Product): Boolean {
        if (shoppingCart.products.isEmpty()) {
            return true
        }

        if (shoppingCart.products.contains(product)) {
            return shoppingCart.products.remove(product)
        }

        return false
    }

    fun addProduct(product: Product): Boolean{
        if (shoppingCart.products.isEmpty()) {
            return shoppingCart.products.add(product)
        }

        if(shoppingCart.products.contains(product)){
            return shoppingCart.products.add(product)
        }

        return false
    }

    fun setCustomer(customer: Customer): Boolean{
        if (shoppingCart.customer!=customer) {
            setOf<Customer>()
            return true
        }

        println(customer)
        return false
    }



}