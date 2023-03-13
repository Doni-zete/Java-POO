package Gassociacao.test;

import Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Pele");
        Jogador jogador3 = new Jogador("Rivaldo");

//        Jogador[] jogadores = new Jogador[3];

        Jogador[] jogadoress = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadoress) {
            jogador.imprimir();
        }
    }
}

