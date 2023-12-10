package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado um valor de um carro descubra quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000

        double valorTotalCarro = 50000;
        double valorParcela;

        for (int parcela = 1; parcela <= valorTotalCarro; parcela++) {
            valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
                System.out.println("Ficará em " +parcela+ " X R$ " +valorParcela);
        }

        System.out.println("-------------------------");

        for (int parcela = 1; parcela <= valorTotalCarro; parcela++) {
            valorParcela = valorTotalCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Ficará em " +parcela+ " X R$ " +valorParcela);
            }else {
                break;
            }
        }
    }
}
