package exerciciosJava;

public class LaçosDeRepetição {
    public static void main(String[] args) {
        System.out.println("----------- exercicio 1 ----------");

        //Use um for para imprimir os números de 1 a 5.


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

        }

        System.out.println("----------- exercicio 2 ----------");
        //Use um while para calcular a soma de todos os números de 1 a 10.

        int j = 1;
        int soma = 0;
        while (j <= 10){
            soma += j;
            j++;
            System.out.println(soma);
        }
        System.out.println("A soma de 1 a 10: "+ soma);


        System.out.println("----------- exercicio 3 ----------");
        //Use um for para imprimir a tabuada do 7 (de 1 a 10).
        int numero = 8;
        for (int i = 0; i <=10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
    }
}
