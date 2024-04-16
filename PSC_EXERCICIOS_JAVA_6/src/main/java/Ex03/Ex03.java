/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 8, pos_p = 0, pos_n = 0;
        Scanner input = new Scanner(System.in);

        int[] a = new int[n];
        int[] positivos = new int[n];
        int[] negativos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero " + (i + 1) + " do vetor: ");
            a[i] = input.nextInt();
            if (a[i] >= 0) {
                positivos[pos_p] = a[i];
                pos_p++;
            } else {
                negativos[pos_n] = a[i];
                pos_n++;

            }
        }
        if (pos_p != 0) {
            System.out.println("Vetor de positivos: ");
            for (int i = 0; i < pos_p; i++) {
                System.out.print(positivos[i] + " ");
            }
        } else {
            System.out.println("Vetor de positivos vazio!");
        }
        if (pos_n != 0) {
            System.out.println("\nVetor de negativos: ");
            for (int i = 0; i < pos_n; i++) {
                System.out.print(negativos[i] + " ");
            }
        } else {
            System.out.println("\nVetor de negativos vazio!");
        }

    }

}
