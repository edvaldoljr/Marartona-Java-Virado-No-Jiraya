package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte numero = 2;

        switch (numero) {
            case 1,7:
                System.out.println("=== Final de semana ===");
                break;
            case 2,3,4,5,6:
                System.out.println("=== Dia útil ===");
                break;
            default:
                System.out.println(" === Entrada invalida ===");
        }
    }
}
