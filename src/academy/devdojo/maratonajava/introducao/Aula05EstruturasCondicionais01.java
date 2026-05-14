package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("voce pode comprar bebidas");
        }
        else {
            System.out.println("Não pode comprar bebidas");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar bebidas");
        }

        boolean c = true;
        if(c = false){
            System.out.println("Dentro de algo que nunca dever ser feito a ");
        }

        System.out.println("fora do if");
    }
}