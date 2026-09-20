// Exercício 07: Lê a hora (0 a 23) e imprime a saudação correspondente usando if, else if e else[cite: 1].
package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora do dia (0 a 23): ");
        int hora = sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Hora inválida");
        }
        sc.close();
    }
}