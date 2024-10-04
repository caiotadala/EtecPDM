fun main() {
    println("1. Olá, mundo!")

    print("2. Caio Telles")
    print(" ")
    print("Caio")

    println()

    var nome = "3. CaioTelles\nSantos\nTelles"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Caio" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Telles"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Telles " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}
