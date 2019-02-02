package Clase_01_28

class actividad2 {
    fun reverseInteger(numero: Int):Int {
        var tmp1: Int = numero
        var digit: Int
        var reverse = 0
        while (tmp1 != 0) {
            digit = tmp1 %10
            tmp1 /= 10
            reverse= reverse *10 + digit
        }
        return reverse
    }
}