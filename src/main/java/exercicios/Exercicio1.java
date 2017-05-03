package exercicios;

import java.util.Scanner;

/**
 * Created by Formando on 03/05/2017.
 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza o 1º número");
        int firstNumber = scanner.nextInt();

        System.out.println("Introduza o 2º número");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println(String.format(
                "Resultado da soma: %d", sum));
    }
}
