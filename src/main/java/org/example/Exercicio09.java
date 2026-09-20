// Exercício 09: Define o percentual e o valor do bônus com base no tempo de casa[cite: 1].
package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário do funcionário: R$ ");
        double salario = sc.nextDouble();
        System.out.print("Tempo de casa (em anos): ");
        int tempo = sc.nextInt();

        double percentual = 0;

        if (tempo < 1) {
            percentual = 0;
        } else if (tempo <= 3) {
            percentual = 5;
        } else if (tempo <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        if (percentual == 0) {
            System.out.println("Não recebe bônus.");
        } else {
            double bonus = salario * (percentual / 100);
            System.out.printf("Percentual do bônus: %.0f%%\n", percentual);
            System.out.printf("Valor do bônus: R$ %.2f\n", bonus);
        }
        sc.close();
    }
}