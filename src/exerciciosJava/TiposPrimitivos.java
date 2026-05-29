package exerciciosJava;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declare duas variáveis inteiras, some-as e exiba o resultado.

        int a = 2;
        int b = 3;
        int soma = a + b;
        System.out.println("-------------exercicio 1 -------------");
        System.out.println("a soma da "+a+"+"+b+" é igual a "+soma);



        System.out.println("-------------exercicio 2 -------------");
        // Declare um double e um int. Multiplique-os e exiba o resultado com tipo correto.
        double x = 20.50;
        int y  = 2;

        double mult= x * y;

        System.out.println("a multiplicacao é "+mult );




        System.out.println("-------------exercicio 3 -------------");
        /*Declare um char, converta para int (valor ASCII) e verifique
         se é letra maiúscula usando os valores 65 (A) e 90 (Z).
         */

        char letra = 'c';
        int ascii = (int) letra;
        boolean maiuscula = ascii >= 65 && ascii <= 90;
        System.out.println("Letra: " + letra);
        System.out.println("ASCII: " + ascii);
        System.out.println("É maiúscula? " + maiuscula);

    }
}
