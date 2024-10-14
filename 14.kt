// Classe base Pessoa
open class Pessoa(val nome: String, var idade: Int) {

    // Método para exibir as informações da pessoa
    open fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
    }
}

// Classe Funcionário que herda de Pessoa
class Funcionario(nome: String, idade: Int, val salario: Double, val cargo: String) : Pessoa(nome, idade) {

    // Método para exibir as informações do funcionário (sobrescrevendo o método da classe Pessoa)
    override fun exibirInformacoes() {
        super.exibirInformacoes() // Chama o método da classe base
        println("Cargo: $cargo")
        println("Salário: R$ $salario")
    }
}

fun main() {
    // Criação de uma instância da classe Funcionario
    val funcionario1 = Funcionario("Gabriel", 30, 5000.0, "Desenvolvedor de Software")

    // Exibindo as informações do funcionário
    funcionario1.exibirInformacoes()
}
