package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua Pedro de Lara");
        Aluno aluno = new Aluno("Yondaime", 20);
        Professor professor = new Professor("Jiraya", "Mestre dos sapos");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Rei dos Sapos", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();
    }
}
