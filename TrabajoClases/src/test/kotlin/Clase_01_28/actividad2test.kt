package Clase_01_28

import org.junit.Assert.assertEquals
import org.junit.Test

class actividad2test {
    private val actividad2 = actividad2()

    @Test
    fun TestReverseInt()
    {
        val value = 1234
        val expected = 4321
        val actual = actividad2.reverseInteger(value)
        assertEquals(expected,actual)
    }

    @Test
    fun TestifReverseNegativeInt()
    {
        val value = -1234
        val expected = -4321
        val actual = actividad2.reverseInteger(value)
        assertEquals(expected,actual)
    }
}