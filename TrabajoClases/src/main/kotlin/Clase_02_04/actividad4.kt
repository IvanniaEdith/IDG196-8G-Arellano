package Clase_02_04

class actividad4 {
    fun isAValidExpression(string: String):Boolean{
            var lista = ArrayList<Char>()
            for (c in string) {
                if (c == '(' || c == '[' || c == '{') {
                    lista.add(c)
                } else if (c == ')') {
                    if (lista[lista.size - 1]=='('){
                        lista.removeAt(lista.size - 1)
                    }
                    return true
                }
                else if (c == ']'){
                    if (lista[lista.size - 1]=='['){
                        lista.removeAt(lista.size - 1)
                    }
                    return true
                }else if (c == '}') {
                    if (lista[lista.size - 1]=='{'){
                        lista.removeAt(lista.size - 1)
                    }
                    return true
                }
            }
            return false
        }
}