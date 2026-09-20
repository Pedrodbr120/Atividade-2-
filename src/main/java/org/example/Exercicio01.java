package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) System.out.println("Pode votar.");
        if (idade >= 18) System.out.println("Pode dirigir.");
        if (idade >= 60) System.out.println("É idoso.");
        sc.close();
    }
}