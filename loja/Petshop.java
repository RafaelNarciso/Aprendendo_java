package loja;

import CursoPo.Animal;
import CursoPo.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDoEspirito("O seu petz está limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDoEspirito("O seu dog está tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDoEspirito("Seu amigão esta com saudade:( ");
    }

    /*
     * @Override
     * public String toString() {
     * return "Petshop []";
     * }
     */

}
