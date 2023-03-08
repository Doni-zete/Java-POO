package Csobrecargametodos.test;

import Csobrecargametodos.dominio.Anime;

public class AnimeTes01 {
    public static void main(String[] args) {
        Anime anime = new Anime();


        anime.incicializar("Dragon Ball Z","TV",100,"Ação");
        anime.imprime();
    }
}
