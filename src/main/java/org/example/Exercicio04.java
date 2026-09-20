package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("A verificação não pode ser feita (divisão por zero).");
        } else {
            if (num1 % num2 == 0) System.out.println(num1 + " é múltiplo de " + num2);
            else System.out.println(num1 + " não é múltiplo de " + num2);
        }
        sc.close();
    }
}