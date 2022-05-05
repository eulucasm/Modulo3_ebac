package br.com.lucao.helloworld.fundamentos

class NullSafety {}

fun main() {

   var inteiro: Int? = null
   var inteiro2 = 5

   var resultado = (inteiro ?: 0) + inteiro2

   var texto: String? = "meu texto"
   var tamanho: Int? = texto?.length
}