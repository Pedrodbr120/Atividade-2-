package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuário: ");
        String user = sc.next();

        if (!user.equals("admin")) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.print("Senha: ");
            String senha = sc.next();
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }
        sc.close();
    }
}