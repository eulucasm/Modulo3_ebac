package br.com.lucao.helloworld.fundamentos.fundamentoDeKotlin

class Loop {}

fun main() {

   var array: IntArray = IntArray(20)


   var i = 0
   //While simples
   while (i <= array.size - 1) {
      //aqui ele exibira o valor 0 pois será exibido o item na primeira posição de i no array
      //println(array[i])
      i++
   }

   //for simples
   for (j in array.indices) {
      array[j] = j * 2
      //println(array[j])
   }

   //for simples
   for (j in 0..array.size - 1) {
      var resultado: Double = array[j] / 3.0
      //println(resultado)
   }

   //for otimizado
   var result = 0.0
   for (x in array) {
      result += x / 3.0
   }
   println(result)

   //while otimizado
   var k = 0
   var resultado = 0.0
   while (k < array.size) {
      resultado += array[k] / 3.0
      k++
   }
   println(resultado)
}