package Agendas_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual " + hoje);// formato ISO internacional

        // para informa uma data de um ano " aqui no caso o ano novo"
        LocalDate ano_novo = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println("Feliz ano novo " + ano_novo);

        // para mostra a data separada
        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();
        System.out.println("O ano novo será " + dia + " mês " + mes + " de " + ano);

        // para saber o periodo de tempo faltante pro ano novo
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);

        // para acesso individual
        System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e "
                + periodo.getDays() + " dias para o ano novo");

        // para formatar as datas
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("Data atual no padrao brasil: " + hoje.format(formatador));

        // para saber a hora e a data formato internacional
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e hora internacional: " + agora);

        // para formada a data e hora (HH =horas 24 hh / =12horas)
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
        System.out.println("\nData e hora  :" + agora.format(formatador_horas));
    }

}
