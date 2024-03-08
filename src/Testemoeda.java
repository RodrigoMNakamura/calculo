import java.util.Scanner;

public class Testemoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        moeda:
        System.out.println("Informe o valor em reais: R$");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.getQuantidadeDolar());


    }
    }

