package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade máxima da via: ");
        double max = sc.nextDouble();
        System.out.print("Velocidade do veículo: ");
        double vel = sc.nextDouble();

        if (vel <= max) {
            System.out.println("Dentro do limite, não há multa.");
        } else if (vel <= max * 1.20) {
            System.out.println("Infração média.");
        } else if (vel <= max * 1.50) {
            System.out.println("Infração grave.");
        } else {
            System.out.println("Infração gravíssima.");
        }
        sc.close();
    }
}
