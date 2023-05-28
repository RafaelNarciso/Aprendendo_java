package CursoPo;

public class Principal {
    public static void main(String[] args) {
        
        /**
         * caracteristisca do objeto cachorro 
         */

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Pupyy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);

    }
}
