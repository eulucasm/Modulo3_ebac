package br.com.lucao.helloworld.fundamentos.fundamentoDeKotlin.exercicios

class Exercicio7 {}

fun main() {
   val numeros: MutableList<Int> = mutableListOf()
   var soma: Int = 0

   for (i in 0..98) {
      numeros.add(i + 1)
      soma += i
   }
   println(soma)
}