package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = (double)numero1 / (double)numero2;
        System.out.println(resultado);
        int resto = 0;
        System.out.println(resto);
        boolean isDezMaiorQueVinte = false;
        boolean isDezMenorQueVinte = true;
        boolean isDezIgualVinte = false;
        boolean isDezIgualDez = true;
        boolean isDezDiferenteDez = false;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualVinte);
        System.out.println("isDezIgualQueDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        int idade = 29;
        float salario = 3500.0F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612.0F;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381.0F;
        System.out.println("isDentroDaLeiMaiorQue30 " + isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);
        double valorTotalContaCorrente = (double)200.0F;
        double valorTotalContaPoupanca = (double)10000.0F;
        float valorPlaycinco = 5000.0F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > (double)valorPlaycinco || valorTotalContaPoupanca > (double)valorPlaycinco;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
        double bonus = (double)1800.0F;
        bonus += (double)1000.0F;
        bonus -= (double)1000.0F;
        bonus *= (double)2.0F;
        bonus /= (double)2.0F;
        bonus %= (double)2.0F;
        System.out.println(bonus);
        int contador = 0;
        ++contador;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}

