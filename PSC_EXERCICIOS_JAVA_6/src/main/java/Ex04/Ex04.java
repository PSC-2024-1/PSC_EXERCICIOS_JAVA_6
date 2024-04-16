/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3, opcao, opcao2;

        int[] voo = new int[n];
        String[] origem = new String[n];
        String[] destino = new String[n];
        int[] lugares = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Informe o numero do voo, origem, destino e número de lugares do voo " + (i + 1));
            voo[i] = input.nextInt();
            input.nextLine();  // Limpa o buffer
            origem[i] = input.nextLine();
            destino[i] = input.nextLine();
            lugares[i] = input.nextInt();

        }

        do {
            System.out.println("::::::::::::::OPÇÕES::::::::::::::");
            System.out.println("""
                                [1] Consultar
                                [2] Efetuar reserva
                                [3] Sair
                                """);
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("::::::::::::::OPÇÕES::::::::::::::");

                    System.out.println("""
                                                           [1] Consultar por voo
                                                           [2] Consultar por origem
                                                           [3] Consultar por destino
                                                           """);
                    System.out.println("Escolha uma opção: ");
                    opcao2 = input.nextInt();
                    input.nextLine();  // Limpa o buffer
                    switch (opcao2) {

                        case 1 -> {
                            int num_voo, i = 0;
                            System.out.println("Informe o número do voo: ");
                            num_voo = input.nextInt();
                            while (i < n && voo[i] != num_voo) {
                                i++;
                            }
                            if (i < n) {
                                System.out.println("Número do voo: " + voo[i]);
                                System.out.println("Origem: " + origem[i]);
                                System.out.println("Destino: " + destino[i]);
                                System.out.println("Número de lugares disponíveis: " + lugares[i]);
                            } else {
                                System.out.println("Voo inexistente!");
                            }
                        }
                        case 2 -> {
                            String local_origem;
                            System.out.println("Informe o local de origem: ");
                            local_origem = input.nextLine();
                            for (int j = 0; j < n; j++) {
                                if (local_origem.equalsIgnoreCase(origem[j])) {
                                    System.out.println("Número do voo: " + voo[j]);
                                    System.out.println("Origem: " + origem[j]);
                                    System.out.println("Destino: " + destino[j]);
                                    System.out.println("Número de lugares disponíveis: " + lugares[j]);
                                }
                            }
                        }
                        case 3 -> {
                            String local_destino;
                            System.out.println("Informe o local de destino: ");
                            local_destino = input.nextLine();
                            for (int j = 0; j < n; j++) {
                                if (local_destino.equalsIgnoreCase(destino[j])) {
                                    System.out.println("Número do voo: " + voo[j]);
                                    System.out.println("Origem: " + origem[j]);
                                    System.out.println("Destino: " + destino[j]);
                                    System.out.println("Número de lugares disponíveis: " + lugares[j]);
                                }
                            }
                        }
                        default ->
                            System.out.println("Opção Inválida!");

                    }
                }

                case 2 -> {
                    int num_voo,
                            i = 0;
                    System.out.println("Informe o número do voo: ");
                    num_voo = input.nextInt();
                    while (i < n && voo[i] != num_voo) {
                        i++;
                    }
                    if (i < n) {
                        if (lugares[i] == 0) {
                            System.out.println("Voo lotado!");
                        } else {
                            lugares[i] -= 1;
                            System.out.println("Reserva confirmada!");
                        }

                    } else {
                        System.out.println("Voo inexistente!");
                    }
                }
                case 3 ->
                    System.out.println("Volte sempre!");
                default ->
                    System.out.println("Opção Inválida!");

            }
        } while (opcao != 3);

    }

}
