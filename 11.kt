import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    while (true) {
        // Exibe o menu de opções
        println("\nCalculadora Científica")
        println("1 - Exponenciação")
        println("2 - Raiz Quadrada")
        println("3 - Sair")
        print("Escolha uma operação: ")
        
        // Lê a escolha do usuário
        when (readLine()?.toIntOrNull()) {
            1 -> {
                // Exponenciação
                print("Informe a base: ")
                val base = readLine()?.toDoubleOrNull()
                print("Informe o expoente: ")
                val expoente = readLine()?.toDoubleOrNull()
                
                if (base != null && expoente != null) {
                    val resultado = base.pow(expoente)
                    println("O resultado de $base elevado a $expoente é: $resultado")
                } else {
                    println("Entrada inválida. Por favor, informe números válidos.")
                }
            }
            2 -> {
                // Raiz quadrada
                print("Informe o número: ")
                val numero = readLine()?.toDoubleOrNull()
                
                if (numero != null && numero >= 0) {
                    val resultado = sqrt(numero)
                    println("A raiz quadrada de $numero é: $resultado")
                } else {
                    println("Entrada inválida. Por favor, informe um número válido e não-negativo.")
                }
            }
            3 -> {
                // Sair do programa
                println("Saindo da calculadora.")
                break
            }
            else -> {
                println("Opção inválida. Por favor, escolha uma opção válida.")
            }
        }
    }
}
