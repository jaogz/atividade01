package Projeto2;

import java.util.Calendar;

public class aula07 {
    public static String getDataPorExtenso() {
        Calendar calendar = Calendar.getInstance();
        String[] diasSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        int diaMes = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        int ano = calendar.get(Calendar.YEAR);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        String dataPorExtenso = "Hoje é " + diasSemana[diaSemana-1] + ", dia " + diaMes + " de " + meses[mes] + " de " + ano + " e agora são " + hora + " horas e " + minuto + " minutos.";
        return dataPorExtenso;
    }

    public static void main(String[] args) {
        String dataPorExtenso = getDataPorExtenso();
        System.out.println(dataPorExtenso);
    }
}
