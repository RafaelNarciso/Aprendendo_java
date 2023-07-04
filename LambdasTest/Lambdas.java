package LambdasTest;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("classe ");
        palavras.add("Est ");
        palavras.add("Rafa ");
        palavras.add("Raiara ");
        palavras.add("Antonia ");
        palavras.add("Narciso ");

        // no sort recebe um comparactor e comparando dentro da lambda
        // 1- forma
        // palavras.sort((s1, s2) -> {
        // if (s1.length() < s2.length()) {
        // return -1;
        // }
        // if (s1.length() > s2.length()) {
        // return 1;
        // }
        // return 0;
        // });
        // 1- e a mesma forma da 1 primeira so que simplificada
        // palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //
        // palavras.forEach(s -> System.out.println(s)); ( :: sigfica
        palavras.forEach(System.out::println);
    }
}
