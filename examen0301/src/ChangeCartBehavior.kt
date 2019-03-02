package xm.ude.sytec.onallera.ainnavi

class ChangeCartBehavior (private val ChangeCart: ChangeCart){

    fun addMoney(tipo: Int, cantidad : Int): Boolean{
        if (ChangeCart.moneda.isEmpty()) {
            ChangeCart.moneda[tipo] = cantidad
            return true
        }

        if(!ChangeCart.moneda.contains(tipo)){
            ChangeCart.moneda[tipo] = cantidad
            return true
        }

        if(ChangeCart.moneda.contains(tipo)){
            var temporal = ChangeCart.moneda[tipo]
            var new = temporal!!+cantidad
            ChangeCart.moneda[tipo] = new
            return true
        }
        return false
    }

    fun getChange():Int{
            val shoppingCartBehavior = ShoppingCartBehavior()
            val customer = Customer()
            var cambio = customer.money - shoppingCartBehavior.getTotal()
            if (cambio < 0){

                print("Sin saldo")
            }
            return cambio
        }


}