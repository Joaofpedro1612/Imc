import java.time.LocalDate
import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()
    var paciente3 = Paciente()

    print("Qual o nome do paciente: ")
    paciente1.nome = leitor.nextLine()

    print("Qual o peso do paciente: ")
    paciente1.peso = leitor.nextInt()


    paciente1.altura = 1.61f


    paciente1.telefone = "(11)97777-5555"


    paciente1.dataNascimento = LocalDate.of(2003, 8, 13)
    paciente1.mostraDados()

    paciente2.nome = "joao"
    paciente2.peso = 78
    paciente2.altura = 1.94f
    paciente2.telefone = "(11)97777-5555"
    paciente2.dataNascimento = LocalDate.of(2007, 8, 12)
    paciente2.mostraDados()

    paciente3.nome = "vitor"
    paciente3.peso = 20
    paciente3.altura = 1.00f
    paciente3.telefone = "(11)97777-5555"
    paciente3.dataNascimento = LocalDate.of(2007, 8, 12)
    paciente3.mostraDados()

}