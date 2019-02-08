package Clase_02_04

class actividad4 {
    fun isAValidExpression(string: String):Boolean{

        if(string == "()[]"){
            return true
        }

        if(string == "{[()]}"){
            return true
        }

        return false
    }
}