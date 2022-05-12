package br.com.lucao.helloworld.fundamentos.fundamentoDeKotlin.exercicios

class Exercicio4 {}

fun main() {
   var numero = 6
   when {
      numero % 2 == 0 -> println("O número é par")
      else -> println("O número é impar")
   }
}