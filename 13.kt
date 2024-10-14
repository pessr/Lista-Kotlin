// Classe base Pessoa
open class Pessoa(val nome: String, var idade: Int) {

    // Método para exibir as informações da pessoa
    open fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
    }
}

// Classe Aluno que herda de Pessoa
class Aluno(nome: String, idade: Int, val matricula: String, val curso: String) : Pessoa(nome, idade) {

    // Método para exibir as informações do aluno (sobrescrevendo o método da classe Pessoa)
    override fun exibirInformacoes() {
        super.exibirInformacoes() // Chama o método da classe base
        println("Matrícula: $matricula")
        println("Curso: $curso")
    }
}

fun main() {
    // Criação de uma instância da classe Aluno
    val aluno1 = Aluno("Gabriel", 21, "2023001234", "Ciência da Computação")

    // Exibindo as informações do aluno
    aluno1.exibirInformacoes()
}
