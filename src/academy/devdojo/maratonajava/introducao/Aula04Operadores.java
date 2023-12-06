package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;

        System.out.println(numero02 + numero01);
        System.out.println(numero02 - numero01);
        System.out.println(numero02 / numero01);
        System.out.println(numero02 * numero01);
        System.out.println(numero02 + numero01 + " valor " + (numero01 + numero02));
        System.out.println(numero02 + numero01 + " valor " + numero01 + numero02);
        System.out.println(resultado);

        // Operador de resto
        int resto = 20 % 2;
        System.out.println(resto);
    }
}
