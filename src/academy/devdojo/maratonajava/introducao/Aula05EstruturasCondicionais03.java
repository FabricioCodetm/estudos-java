package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        /*dedicidir se vou fazer uma doação para o DevDojo de 500 reais,
        mas so posso fazer a doação se meu salario for a cima de 15
    */

        double salario = 6000;
        //String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";

        //(condicao) ? verdadeiro : falso
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        //A forma mais resumida e a mais correta seria assim!
        String resultado = salario > 5000 ? "Eu vou doar 500 reais para o DevDojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }

}
