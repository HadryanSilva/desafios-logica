import java.util.Scanner;

public class Desafio2 {

    /*
        Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
        monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
        pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
        possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
        necessárias.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String totalString = read.nextLine();
        double total = Double.parseDouble(totalString);

        //Armazenando a quantidade total de Notas
        int qtdeNotas = (int) total;

        //Armazenando o total de moedas
        int qtdeMoedas = (int) ((total - qtdeNotas) * 100);

        //Coletando a quantidade de Notas Necessárias para cada valor
        int notas100 = qtdeNotas / 100;
        qtdeNotas -= notas100 * 100;
        int notas50 = qtdeNotas / 50;
        qtdeNotas -= notas50 * 50;
        int notas20 = qtdeNotas / 20;
        qtdeNotas -= notas20 * 20;
        int notas10 = qtdeNotas / 10;
        qtdeNotas -= notas10 * 10;
        int notas5 = qtdeNotas / 5;
        qtdeNotas -= notas5 * 5;
        int notas2 = qtdeNotas / 2;
        qtdeNotas -= notas2 * 2;
        int moedas1 = qtdeNotas;
        qtdeNotas -= moedas1;
        int moedas50 = qtdeMoedas / 50;
        qtdeMoedas -= moedas50 * 50;
        int moedas25 = qtdeMoedas / 25;
        qtdeMoedas -= moedas25 * 25;
        int moedas10 = qtdeMoedas / 10;
        qtdeMoedas -= moedas10 * 10;
        int moedas05 = qtdeMoedas / 5;
        qtdeMoedas -= moedas05 * 5;
        int moedas01 = qtdeMoedas;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00\n");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

        read.close();
    }

}
