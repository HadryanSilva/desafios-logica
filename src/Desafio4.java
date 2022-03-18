import java.util.Scanner;

public class Desafio4 {

    /*
        A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
        de olhar para várias páginas impressas por um tempo, você percebe que ele está
        imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
        linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
        modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
        prosseguindo em direção ao centro da página.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = Integer.parseInt(read.nextLine());

        for (int i = 0; i < n; i ++) {

            String linha = read.nextLine();

            // Obtendo o tamanho total da String
            int tamanho = linha.length();
            // Obtendo o Index da metade da String
            int divisao = tamanho / 2;

            // Usando SubStrings para quebrar a String em duas partes iguais
            String subLinha = linha.substring(divisao);
            String sublinha2 = linha.substring(0, divisao);

            // Usando StringBuilder para usar o Método Reverse
            StringBuilder sb = new StringBuilder(sublinha2);
            sb.reverse();

            StringBuilder sb2 = new StringBuilder(subLinha);
            sb2.reverse();

            System.out.println(sb +""+ sb2);
        }


    }

}
