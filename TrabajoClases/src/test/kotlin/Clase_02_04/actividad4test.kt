package Clase_02_04

import org.junit.Assert
import org.junit.Test

class actividad4test {
    private val actividad4 = actividad4()

    @Test
    fun `return false when string is disorganized`(){
        val string = "([)]"
        val expected = false
        Assert.assertFalse(actividad4.isAValidExpression(string))
    }

    @Test
    fun `return false when string are incomplete`(){
        val string = "(]"
        val expected = false
        Assert.assertFalse(actividad4.isAValidExpression(string))
    }

    @Test
    fun `return true when string is organized`(){
        val string = "()[]"
        val expected = true
        Assert.assertTrue(actividad4.isAValidExpression(string))
    }

    @Test
    fun `return true when string is organized and has more than two signs`(){
        val string = "{[()]}"
        val expected = true
        Assert.assertTrue(actividad4.isAValidExpression(string))
    }

    @Test
    fun `return true when string are complete`(){
        val string = "()[]{}"
        val expected = true
        Assert.assertTrue(actividad4.isAValidExpression(string))
    }
}