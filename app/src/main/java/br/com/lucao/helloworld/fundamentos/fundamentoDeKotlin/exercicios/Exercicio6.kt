package br.com.lucao.helloworld.fundamentos.fundamentoDeKotlin.exercicios

class Exercicio6 {}

fun main() {
   var numeros: MutableList<Int> = mutableListOf()
   for(i in 0..98){
      numeros.add(i+1)
      println(numeros[i])
   }
}