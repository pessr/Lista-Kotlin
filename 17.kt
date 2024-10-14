class ContaCorrente(val numeroConta: String, var saldo: Double) {

    // Método para realizar depósito
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso. Saldo atual: R$$saldo")
        } else {
            println("Valor de depósito inválido.")
        }
    }

    // Método para realizar saque
    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso. Saldo atual: R$$saldo")
        } else {
            println("Saque não permitido. Saldo insuficiente ou valor inválido.")
        }
    }

    // Método para realizar transferência
    fun transferir(valor: Double, contaDestino: ContaCorrente) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            contaDestino.saldo += valor
            println("Transferência de R$$valor para a conta ${contaDestino.numeroConta} realizada com sucesso.")
            println("Saldo atual da conta ${numeroConta}: R$$saldo")
        } else {
            println("Transferência não permitida. Saldo insuficiente ou valor inválido.")
        }
    }
}

fun main() {
    // Criando duas contas correntes
    val conta1 = ContaCorrente("12345-6", 1000.0)
    val conta2 = ContaCorrente("65432-1", 500.0)

    // Exibindo as operações
    conta1.depositar(300.0)
    conta1.sacar(200.0)
    conta1.transferir(400.0, conta2)

    println("\nSaldo final da Conta 1: R$${conta1.saldo}")
    println("Saldo final da Conta 2: R$${conta2.saldo}")
}
