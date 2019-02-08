package Clase_02_01
import org.junit.Assert.assertFalse
import org.junit.Test


class actividad3test {
    private val actividad3 = actividad3()

    @Test
    fun `return false when number is negative`(){
        val number = -100
        val expected = false
        assertFalse(actividad3.isPalindrome(number))
    }

    @Test
    fun `return false when number ends in zero and the number is not zero`(){
        val number = 1000
        assertFalse(actividad3.isPalindrome(number))
    }

    @Test
    fun `return false when numbers are not palindrome`(){
        val number = 89765
        assertFalse(actividad3.isPalindrome(number))
    }


}