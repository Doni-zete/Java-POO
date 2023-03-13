package Gassociacao.test;
//Relacionamento bidimecional

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Roberto Carlos");
        Jogador jogador2 = new Jogador("Ronaldo");

        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("====Jogador====");
        jogador.imprimir();

        System.out.println("====Time====");
        time.imprimir();

    }
}
