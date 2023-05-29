package CursoPo;

import loja.PetShop;

public class Principal1 {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Pupyy", "Marrom", 25, 5.5, "nada");
        Gato gato1 = new Gato("lily", "preto", 15, 3.5, "neutro");
        Passaro passaro1 = new Passaro("Frajola", "amarelo", 05, 0.1, "neutro");

        System.out.println("\n__________________________________________________________________________________");
        System.out.println("Aqui utilizamos o método de @Override que e possivel modificar o som do animal em");
        System.out.println("vez de sair cri cri criado no methodo pai,");
        System.out.println(" o animal aqui recebeu o som da voz de acordo com sua espece no caso gato faz miau .");
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        System.out.println("__________________________________________________________________________________\n");

    }

}
