package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //quanto eu tenho que pagar na holanda em 2020 baseado no meu salario anual
    /*  € 0 -   34,712  9.70%
        € 34,713 -  68,507  37,35%
        € 68,508 - 49,50%
     */

    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if(salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }
        else  {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);

        System.out.println("o valor do importa é de "+valorImposto+" sobre o salario de "+salarioAnual);
    }
}
