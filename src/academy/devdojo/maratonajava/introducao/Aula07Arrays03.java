package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[] {5,4,3,2,1};

        for (int numero : numeros) {
            System.out.println(numero);
        }

        for (int numero2 : numeros2) {
            System.out.println(numero2);
        }

        for (int numero3 : numeros3) {
            System.out.println(numero3);
        }
    }
}
