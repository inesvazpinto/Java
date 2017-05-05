package exercicios;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Formando on 05/05/2017.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++ ) {
            System.out.println("input number" + (i+1));
                values[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(values));

        System.out.println("last from array: " + values[9]);

        for (int i = 0; i < values.length; i++){

            int dif = values[9] - values[i];
            System.out.println(String.format(
                    "Result: %d", dif));
        }


    }

}

