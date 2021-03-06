import java.util.*;

public class Desafio1 {

    /*
        Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
        o seguinte critério:
         • Primeiro os Pares
         • Depois os Ímpares
        Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
        em ordem decrescente.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        int[] totalNumeros = new int[n];


        //Armazenando os Valores
        for(int i = 0; i < n ; i++) {
            totalNumeros[i] = read.nextInt();
        }

        Arrays.sort(totalNumeros);

        int[] pares = new int[n];
        int[] impares = new int[n];


        for(int i = 0; i < totalNumeros.length ; i++) {
            Arrays.sort(totalNumeros);
            if(totalNumeros[i] % 2 == 0) {
                pares[i] = totalNumeros[i];
                System.out.println(pares[i]);

            } else {
                impares[i] = totalNumeros[i];
            }
        }

        //Ordenando os Impares de forma decrescente
        for(int i = 0; i < impares.length;i++) {
            impares[i]=-impares[i];
        }

        Arrays.sort(impares);

        for(int i = 0; i < impares.length;i++) {
            impares[i]=-impares[i];

            if(impares[i] != 0){
                System.out.println(impares[i]);
            }
        }

        read.close();

    }

}
