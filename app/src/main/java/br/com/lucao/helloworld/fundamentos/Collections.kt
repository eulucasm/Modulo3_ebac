package br.com.lucao.helloworld.fundamentos

class Collections {}

fun main() {
   /** Exemplo de Array

   var array: Array<String> = Array(10) {""}
   var array2: DoubleArray = DoubleArray(4) {i -> 1.0 * i} //nesse array, nao precisamos inicialo como no exemplo acima

   array2[0] = 5.0 //acessando a posição e alterando o valor dela
   array2.set(1, 15.0)//acessando a posição e alterando o valor dela

   println(array2[0])
   println(array2.get(1))
    */

   /** MutableList and immutableList
   var mutableList: MutableList<Int> = mutableListOf() //criando uma lista vazia, lista mutavel
   var lista: List<String> = listOf("valor1", "valor2") //lista imutavel

   mutableList.add(5)
   mutableList.add(6)
   println(mutableList.size)
   mutableList.remove(0)
   mutableList[0] = 1
   mutableList.set(0,7)
   println(mutableList[0])
   println(lista.get(0))
   */

   /** MutableMap and ImmutableMap
   val mutableMap: MutableMap<String, String> = mutableMapOf() //mutable
   var map: Map<Int, Int> = mapOf(Pair(5, 10)) //immutable

   println(mutableMap.contains("Lucas"))
   mutableMap["Lucas"] = "Aluno"
   println(mutableMap.contains("Lucas"))
   mutableMap.put("Lucas", "Aluno ebac")
   println(mutableMap.get("Lucas"))
   println(mutableMap["jão"])
   */
}
