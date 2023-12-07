package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 16;
        String categoria;

        if (idade < 15 ){
            categoria = "=== CATEGORIA INFANTIL ===";
        } else if (idade >= 15 && idade < 18 ) {
            categoria = "=== CATEGORIA JUVENIL ===";
        } else {
            categoria = "=== CATEGORIA ADULTA ===";
        }
        System.out.println(categoria);
    }
}
