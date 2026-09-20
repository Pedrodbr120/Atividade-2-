// Exercício 13: Lê dois números e executa uma operação matemática usando a estrutura switch (case ->)[cite: 1].
package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.printf("Resultado: %.2f\n", (num1 + num2));
            case 2 -> System.out.printf("Resultado: %.2f\n", (num1 - num2));
            case 3 -> System.out.printf("Resultado: %.2f\n", (num1 * num2));
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("A verificação não pode ser feita (divisão por zero).");
                } else {
                    System.out.printf("Resultado: %.2f\n", (num1 / num2));
                }
            }
            default -> System.out.println("Opção inválida.");
        }
        sc.close();
    }
}