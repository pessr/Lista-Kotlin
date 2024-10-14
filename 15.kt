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

    // Método para exibir as informações do aluno
    override fun exibirInformacoes() {
        super.exibirInformacoes() // Chama o método da classe base
        println("Matrícula: $matricula")
        println("Curso: $curso")
    }
}

// Classe Funcionário que herda de Pessoa
class Funcionario(nome: String, idade: Int, val salario: Double, val cargo: String) : Pessoa(nome, idade) {

    // Método para exibir as informações do funcionário
    override fun exibirInformacoes() {
        super.exibirInformacoes() // Chama o método da classe base
        println("Cargo: $cargo")
        println("Salário: R$ $salario")
    }
}

// Função main
fun main() {
    // Instanciando um objeto da classe Pessoa
    val pessoa = Pessoa("João", 40)
    println("Informações da Pessoa:")
    pessoa.exibirInformacoes()

    // Instanciando um objeto da classe Aluno
    val aluno = Aluno("Maria", 20, "202310001", "Engenharia")
    println("\nInformações do Aluno:")
    aluno.exibirInformacoes()

    // Instanciando um objeto da classe Funcionario
    val funcionario = Funcionario("Carlos", 35, 6500.0, "Gerente de Projetos")
    println("\nInformações do Funcionário:")
    funcionario.exibirInformacoes()
}
