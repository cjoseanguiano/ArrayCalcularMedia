/*
 * Programa que lea por teclado 10 números enteros y los guarde en un array.
 * A continuación calcula y muestra la media de los valores positivos y la  de 
 *los valores negativos.
 */
package arraylistcalcularmedia;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayCalcularMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[4];
        Scanner entrada = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int pos = 0, neg = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Dato [" + i + "] contiene : ");
            numeros[i] = entrada.nextInt();

        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivo += numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                negativo += numeros[i];
                neg++;
            }
        }

        if (pos != 0) {
            System.out.println("POSITIVO " + positivo);
            System.out.println("Media de valores positivos " + positivo / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }

        if (neg != 0) {
            System.out.println("NEGATIVO " + negativo);
            System.out.println("Media de valores negativos " + negativo / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");

        }
    }

}
