package javacore.introducao.classes.test;

import javacore.introducao.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome  = "Freza";
        prof.idade = 58;
        prof.sexo = 'A';

        System.out.println("Nome: "+ prof.nome + ", idade: "+ prof.idade + ", Sexo: "+prof.sexo );
    }
}
