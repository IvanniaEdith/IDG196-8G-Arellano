package Clase3
import org.junit.Assert.assertEquals
import org.junit.Test

class Actividad1 {
    @Test
    fun Suma(lista: IntArray, num: Int): IntArray {
        var array = intArrayOf(0,0)
        for(i in lista.indices) {
            for(j in i+1 until lista.size)   {
                if(lista[i]+lista[j]==num)  {
                    array[0]=i
                    array[1]=j
                }
            }
        }
        return array
    }

    @Test
    fun primerTest() {
        var lista = intArrayOf(9, 6, 4, 8, 1);
        var lugar = intArrayOf(2, 3);

        assertEquals(lugar.get(0), Suma(lista,12).get(0));
    }
}