package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000

        for (int i = 2; i <= 100; i+=2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
