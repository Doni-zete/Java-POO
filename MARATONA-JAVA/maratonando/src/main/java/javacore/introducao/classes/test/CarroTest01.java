package javacore.introducao.classes.test;

import javacore.introducao.classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();


        carro1.nome = "Gol";
        carro1.marca = "WOlksvagen";
        carro1.ano= 2023;


        Carro carro2 = new Carro();
        carro2.nome = "Camaro";
        carro2.marca = "Bluered";
        carro2.ano= 2123;


        System.out.println("Carro 1");
        System.out.println("Nome do carro: " + carro1.nome + ", marca: " + carro1.marca + ", ano: " + carro1.ano);

        System.out.println();

        System.out.println("Carro 2");
        System.out.println("Nome do carro: " + carro1.nome + ", marca: " + carro1.marca + ", ano: " + carro1.ano);
    }



}
