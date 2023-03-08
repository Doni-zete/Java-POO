package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Funcionario;
import Bintroducaometodos.dominio.ImpressoraFuncionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        ImpressoraFuncionario impressoraFuncionario = new ImpressoraFuncionario();

        funcionario1.setNome("Ciclope");
        funcionario1.setIdade(28);
        funcionario1.setSalarios(new double[]{1200, 987.52, 5000});

        funcionario2.setNome("Jack chan");
        funcionario2.setIdade(58);
        funcionario2.setSalarios(new double[]{4000, 987.52, 8000});

        funcionario3.setNome("Mario Bross");
        funcionario3.setIdade(38);
        funcionario3.setSalarios(new double[]{1200, 1987.52, 7000});


        funcionario1.imprimir();
        funcionario2.imprimir();
        funcionario3.imprimir();

        funcionario1.imprimirMedias();
        funcionario2.imprimirMedias();
        funcionario3.imprimirMedias();

    }
}
