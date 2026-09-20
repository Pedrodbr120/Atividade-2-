package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite diário: ");
        double limite = sc.nextDouble();
        System.out.print("Valor solicitado: ");
        double valor = sc.nextDouble();

        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valor > limite) {
                System.out.println("Valor ultrapassa o limite diário de saque.");
            } else {
                saldo -= valor;
                System.out.printf("Saque efetuado. Novo saldo: R$ %.2f\n", saldo);
            }
        }
        sc.close();
    }
}