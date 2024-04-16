/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        Scanner input = new Scanner(System.in);

        int[] a = new int[n];
        int[] b = new int[n];
        int[] resultante = new int[n * 2];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero " + (i + 1) + " do vetor A: ");
            a[i] = input.nextInt();
            System.out.println("Informe o numero " + (i + 1) + " do vetor B: ");
            b[i] = input.nextInt();

            resultante[i * 2] = a[i];
            resultante[i * 2 + 1] = b[i];
        }
        System.out.println("Vetor A");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nVetor B");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nVetor Resultante");
        for (int i = 0; i < (n * 2); i++) {
            System.out.print(resultante[i] + " ");
        }

    }

}
