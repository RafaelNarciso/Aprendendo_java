package loja;

import CursoPo.Cachorro;
import CursoPo.Gato;
import CursoPo.Passaro;

public class PrincipalPetz {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Pupyy", "Marrom", 25, 5.5, "nada");
        Gato gato1 = new Gato("lily", "preto", 15, 3.5, "neutro");
        Passaro passaro1 = new Passaro("Frajola", "amarelo", 05, 0.1, "neutro");

        System.out.println("\n__________________________________________________________________________________");
        System.out.println("Aqui utilizamos o método de abstract -> public abstract void soar();");
        System.out.println("para que as classe filha possam executar a  sua propira função soar ,");
        System.out.println(" sem a necessidade de ficar repetindo.");
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        System.out.println("__________________________________________________________________________________\n");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDoEspirito());

        petshop.deixarNoHotel(cachorro1);
        System.out.println(cachorro1.getEstadoDoEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDoEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDoEspirito());

    }
}
