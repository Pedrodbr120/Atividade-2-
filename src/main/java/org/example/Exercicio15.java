package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de veículo (1 - Carro, 2 - Moto): ");
        int tipo = sc.nextInt();

        double tarifa = switch (tipo) {
            case 1 -> 8.00;
            case 2 -> 5.00;
            default -> -1;
        };

        if (tarifa == -1) {
            System.out.println("Opção inválida.");
        } else {
            System.out.print("Quantidade de horas: ");
            int horas = sc.nextInt();
            double valorTotal = tarifa * horas;

            System.out.print("Possui cupom? (sim/nao): ");
            String cupom = sc.next();

            if (cupom.equalsIgnoreCase("sim")) {
                if (valorTotal >= 50.00) {
                    valorTotal *= 0.80; // 20% de desconto
                    System.out.println("Desconto de 20% aplicado.");
                } else {
                    System.out.println("Cupom vale apenas para valores acima de R$ 50,00.");
                }
            }

            if (horas > 12) System.out.println("Aviso: Permanência longa.");
            if (horas > 24) System.out.println("Aviso: Cobrança de diária ativada.");

            System.out.print("Classificação: ");
            if (horas <= 2) System.out.println("Curta");
            else if (horas <= 6) System.out.println("Média");
            else System.out.println("Longa");

            System.out.printf("Valor final a pagar: R$ %.2f\n", valorTotal);
        }
        sc.close();
    }
}