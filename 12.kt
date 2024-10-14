class Pessoa(val nome: String, var idade: Int) {

    // Método para exibir as informações da pessoa
    fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
    }
    
    // Método para atualizar a idade
    fun atualizarIdade(novaIdade: Int) {
        idade = novaIdade
    }
}

fun main() {
    // Criação de uma instância da classe Pessoa
    val pessoa1 = Pessoa("Gabriel", 25)

    // Exibindo as informações da pessoa
    pessoa1.exibirInformacoes()

    // Atualizando a idade e exibindo novamente
    pessoa1.atualizarIdade(26)
    println("\nApós atualização da idade:")
    pessoa1.exibirInformacoes()
}
