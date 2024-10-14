fun processarString(input: String?) : String {
    // Utiliza o operador Elvis para fornecer um valor padrão caso a string seja nula
    val resultado = input ?: "Valor padrão"

    // Imprime uma mensagem com o valor resultante
    println("A string resultante é: $resultado")

    // Retorna o valor resultante
    return resultado
}

fun main() {
    // Exemplo de uso da função com uma string nula
    processarString(null)

   
