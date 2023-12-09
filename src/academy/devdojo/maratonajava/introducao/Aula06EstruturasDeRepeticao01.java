package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Estruturas de repetição que temos: while, do while, for

        //imprimindo numeros de 1 a 10

        int count = 0;
        while (count < 10) {
            System.out.println(++count);
            //count++;
        }

        System.out.println("-------------------------");

        count = 0;
        do {
            System.out.println(++count);
            //count++;
        } while (count < 10);

        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
