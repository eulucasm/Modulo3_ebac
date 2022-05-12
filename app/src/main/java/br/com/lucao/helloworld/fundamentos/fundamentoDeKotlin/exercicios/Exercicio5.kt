package br.com.lucao.helloworld.fundamentos.fundamentoDeKotlin.exercicios

class Exercicio5 {}

fun main() {
   var array: IntArray = IntArray(40)
   for(i in array.indices){
      println(i)
   }
}