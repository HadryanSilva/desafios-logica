import java.util.Scanner;

public class Desafio3 {

    /*
        Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
        do array em que a sua diferença seja igual ao valor alvo.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int k = read.nextInt();

        int pares = 0;

        int[] numeros = new int[n];

        for(int i = 0; i < n; i++) {
            numeros[i] = read.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n ; j++) {
                if (numeros[i] - numeros[j] == k) {
                    pares += 1;
                }
            }
        }

        System.out.println(pares);
    }

}
