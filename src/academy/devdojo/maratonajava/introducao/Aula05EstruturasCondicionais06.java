package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 imprima de é dia util ou final de semana
        //considerando como domingo

        int dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}

//Jeito que eu fiz
/*System.out.println("Domingo");
                System.out.println("FDS");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia de semana");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia de semana");
                break;
            case 4:
                System.out.println("Quanta");
                System.out.println("Dia de semana");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia de semana");
                break;
            case 6:
                System.out.println("Dia de semana");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("FDS");
                break;
            default:
                System.out.println("este valor não é valido");

 */