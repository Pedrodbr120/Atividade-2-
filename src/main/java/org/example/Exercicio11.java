// Exercício 11: Verifica a frequência primeiro e, se suficiente, avalia a média final (if aninhado)[cite: 1].
package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frequência (%): ");
        double frequencia = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else {
            System.out.print("Média final: ");
            double media = sc.nextDouble();

            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media >= 5 && media < 7) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado por nota.");
            }
        }
        sc.close();
    }
}
