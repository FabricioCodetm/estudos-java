package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'  '  '
        // boolean false
        // String null

   /* int [] idades = new int[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    */
        String [] nomes = new String[3];
        nomes [0] = "Goku";
        nomes [1] = "kurosaki";
        nomes [2] = "luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
