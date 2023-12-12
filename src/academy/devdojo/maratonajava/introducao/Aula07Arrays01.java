package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        int[] idades = new int[10];
        idades[0] = 27;
        idades[1] = 31;
        System.out.println("Idade 0: " + idades[0]);
        System.out.println("Idade 1: " + idades[1]);
        System.out.println("Idade 2: " + idades[2]);

        System.out.println("------------------------------");

        int[] i = {10,25};
        System.out.println("i 0: " + i[0]);
        System.out.println("i 1: " + i[1]);

        System.out.println("------------------------------");

        int[] k = new int[]{1,2,3};
        System.out.println("k 0: " + k[0]);
        System.out.println("k 1: " + k[1]);
        System.out.println("k 2: " + k[2]);

        System.out.println("------------------------------");

        int[] j = new int[2];
        System.out.println("j 0: " + j[1]);

        System.out.println("------------------------------");

        idades = new int[]{12,35,45,22,9,37,51,62};

        //Exibindo todas as idades continas dento do array com for each
        for (int idade : idades) {
            System.out.println("Idade: " + idade);
        }

        System.out.println("------------------------------");

        //Exibindo todas as idade continas dentro do array com laço for
        for (int a = 0; a < idades.length; a++){
            int idade = idades[a];
            System.out.println("Idade: " + idade);
        }

        System.out.println("------------------------------");

        //Exibindo idade >= 18  com for each
        for (int idade : idades) {
            if (idade >= 18) {
                System.out.println("Idade " +idade+ " é maior que 18 anos");
            }
        }

        System.out.println("------------------------------");

        //Exibindo idades >= 18 com laço for
        for (int a = 0; a < idades.length; a++){
            int idade = idades[a];
            if (idade >= 18) {
                System.out.println("Idade " +idade+ " é maior que 18 anos");
            }
        }
    }
}
