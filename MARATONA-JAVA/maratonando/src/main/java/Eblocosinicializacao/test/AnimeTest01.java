package Eblocosinicializacao.test;

import Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }

        System.out.println(anime1.getEpisodios());
    }
}
