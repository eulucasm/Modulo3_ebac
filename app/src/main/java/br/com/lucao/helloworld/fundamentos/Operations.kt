package br.com.lucao.helloworld.fundamentos

class Operations {}

fun main() {
   val test = 1
   var convertion: Double = test.toDouble()

   val a = 5
   val b = 2

   var resultado = a / b
   var resultado2 = a % b
   var resultado3 = (1.0 * a) / b
   var resultado4 = a.toDouble() / b.toDouble()

   println(resultado)
   println(resultado2)
   println(resultado3)
   println(resultado4)

   var texto = "5"
   var numero = 10
   var resultado5 = texto.toInt() - numero

   println(resultado5)
}