package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Somando");
        calculadora.somarNumeros(86, 52);

        System.out.println("Subtrair");
        calculadora.subtraiNumeros(20, 5);

        System.out.println("Multiplicando");
        calculadora.multiplicarNumeros(10, 3.5);

        System.out.println("Dividindo");
        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);

        System.out.println("Dividindo");

        resultado = calculadora.divideDoisNumeros(20,0);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println("-----------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);

    }


}
