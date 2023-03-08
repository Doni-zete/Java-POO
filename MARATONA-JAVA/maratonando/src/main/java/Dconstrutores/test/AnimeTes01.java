package Dconstrutores.test;

import Dconstrutores.dominio.Anime;

public class AnimeTes01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kakaroto", "TV", 100, "Ação", "Prodiction GD");
//        anime.incicializar("Dragon Ball Z","TV",100,"Ação");
        anime.imprime();

    }
}
