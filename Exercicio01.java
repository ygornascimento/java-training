/*
1.Vou verificar se os as variáveis foram informadas, pois não há possibilidade de não se colocar uma data. Vou fazer um if simples pra isso. 
2.Tendo as duas datas, preciso garantir que a data início é menor que a data fim. Aqui também vou fazer a lógica de comparação usando if. 
3. Vou garantir que essas datas não sejam maiores do que 30 dias. 


*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate daysAfter = today.plusDays(30);

         System.out.print(periodoValido(today, daysAfter));
         
    }

    static boolean periodoValido(LocalDate dataInicio, LocalDate dataFim) {

        if (dataInicio == null || dataFim == null) {
            System.out.print("Alguma data está nulas. ");
            return false;
        } else if (dataInicio.isAfter(dataFim)){
            System.out.print("Data início começa depois de DataFim. ");
            return false;
        } else if (ChronoUnit.DAYS.between(dataInicio, dataFim) > 30) {
            System.out.print("O intervalo entre datas é maior que 30 dias. ");
            return false;
        } else {
            System.out.print("Checagem válida. ");
            return true;
        }
    }
}