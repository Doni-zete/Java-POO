package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudadeTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Kilua";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
