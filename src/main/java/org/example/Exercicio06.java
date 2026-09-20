package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();
        double frete;

        if (valor >= 199.00) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        System.out.printf("Frete: R$ %.2f\n", frete);
        System.out.printf("Total a pagar: R$ %.2f\n", (valor + frete));
        sc.close();
    }
}
