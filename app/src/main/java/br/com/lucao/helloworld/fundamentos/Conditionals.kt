package br.com.lucao.helloworld.fundamentos

class Conditionals {}

fun main() {
   var numero1 = 5
   var numero2 = 10
   var numero3 = 15

   if(numero1 > numero2 && numero1 > numero3){
      println("numero1 é o maior numero")
   }else if (numero1 > numero2){
      println("numero1 é maior que numero2")
   }else if(numero1 > numero3){
      println("numero1 maior que numero3")
   }else{
      println("numero1 menor que todos")
   }

   when{
      numero1 > numero2 && numero1 > numero3 -> println("numero1 maior que todos")
      numero1 > numero2 -> println("numero 1 maior que numero2")
      numero1 > numero3 -> println("numero 1 maior que numero3")
      else -> println("numero1 menor que todos")
   }

   var resultadoWhen = when{
      numero1 > numero2 && numero1 > numero3 -> println("numero1 maior que todos")
      numero1 > numero2 -> println("numero 1 maior que numero2")
      numero1 > numero3 -> println("numero 1 maior que numero3")
      else -> println("numero1 menor que todos")
   }
}
