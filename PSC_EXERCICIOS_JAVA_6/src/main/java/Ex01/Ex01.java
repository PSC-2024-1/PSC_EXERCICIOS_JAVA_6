/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 9, cont;
        int[] primos = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero: "+(i+1));
            primos[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cont = 0;
            for (int j = 1; j <= n; j++) {
                if(primos[i] % j == 0){
                    cont++;
                }
            }
            if(cont <= 2){
                System.out.println("Número: "+ primos[i] + " - posição: "+ i);
            }
            
        }

    }
}
