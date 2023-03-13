package Gassociacao.test;
//Relacionamento de Um para muitos

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");

        Time time = new Time("Brazil");

        jogador1.setTime(time);
        jogador1.imprimir();
    }
}
