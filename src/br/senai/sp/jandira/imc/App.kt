package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Paciente
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Consulta
import java.time.LocalDate
import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()
    var paciente3 = Paciente()

    print("Qual o nome do paciente: ")
    //paciente1.nome = leitor.nextLine()

    print("Qual o peso do paciente: ")
    //paciente1.peso = leitor.nextInt()


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

    //Criação de médicos
    var medico = Medico()
    var medico1 = Medico()
    var medico2 = Medico()

//Preenchedo os dados de cada médico

    medico.nome = "Ana Maria"
    medico.crm = "11111"
    medico.telefone = "(11)97777-5453"
    medico.especialidades.add("Nutricionista")
    medico.especialidades.add("Gastroenterologista")
    medico.mostrarFichaDoMedico()

    medico1.nome = "joao"
    medico1.crm = "22222"
    medico1.telefone = "(11)97777-2222"
    medico1.especialidades.addAll(listOf("Nutricionista","Otorrinolaringologista","Clinico Geral"))
    medico1.mostrarFichaDoMedico()

    medico2.nome = "paulo"
    medico2.crm = "24442"
    medico2.telefone = "(11)97563-2222"
    medico2.especialidades.addAll(listOf("Nutricionista","Otorrinolaringologista","la ele"))
    medico2.mostrarFichaDoMedico()

  //consulta paciente 1

    var c1 = Consulta()
    c1.marcarConsulta(-100.0,LocalDate.of(2025, 2, 21)

}




