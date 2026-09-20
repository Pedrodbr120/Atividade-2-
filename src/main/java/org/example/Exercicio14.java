package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 2 -> System.out.println("28 dias.");
            case 4, 6, 9, 11 -> System.out.println("30 dias.");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 dias.");
            default -> System.out.println("Mês inválido.");
        }
        sc.close();
    }
}