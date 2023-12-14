package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        //  [i][j]
        dias[0][0] = 01;
        dias[0][1] = 02;
        dias[0][2] = 03;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.print(dias[i][j] + " | ");
            }
            System.out.print("\n");
        }

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.print(num +" | ");
            }
            System.out.print("\n");
        }

    }
}
