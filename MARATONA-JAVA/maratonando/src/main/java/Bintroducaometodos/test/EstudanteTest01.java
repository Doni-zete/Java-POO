package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
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

        //fazendo referencia para o mesmo objeto estuadante
       impressoraEstudante.imprime(estudante01);
       impressoraEstudante.imprime(estudante02);

        System.out.println("+++++++++++++++++++");

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

    }
}
