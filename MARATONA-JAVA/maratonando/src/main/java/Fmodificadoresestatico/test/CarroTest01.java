package Fmodificadoresestatico.test;

import Fmodificadoresestatico.domain.Carro;

public class CarroTest01 {

//    colocano o static consegue acessar
   static String testando;

    //    metodo static public que não retorna
    //    nada void e esta recebendo um array de string como argumentos
    public static void main(String[] args) {
//       testando.equals()
        Carro.setVelocidadeLimite(180);
        Carro carro1 = new Carro("Gol", 280);
        Carro carro2 = new Carro("Camaro", 250);
        Carro carro3 = new Carro("Lamborguini", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
