package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    //Dado um valor mostre os 25 primeiros numeros
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++){
            System.out.println(i);
            if (i >= 25) {
                break;
            }
        }
    }
}
