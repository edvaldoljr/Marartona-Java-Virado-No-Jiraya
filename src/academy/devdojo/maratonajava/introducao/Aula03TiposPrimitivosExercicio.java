package academy.devdojo.maratonajava.introducao;

/*
Prática:

Crie váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço> confirmo que recebi o salário de <salário>,
 na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "Junior";
        String endereco = "Rua campinas n° 45 bloco J0 ap 03";
        double salario = 3000D;
        String dataRecebimentoSalario = "06/12/2023";
        String relatorio = "Eu, " +nome+ " morando no endereço " +endereco+ " confirmo que recebi o salário de " +salario+
                " na data " +dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
