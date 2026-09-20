package br.com.seunome.lista02;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura (Celsius): ");
        double temp = sc.nextDouble();
        System.out.print("Umidade relativa (%): ");
        double umidade = sc.nextDouble();

        if (temp >= 38) System.out.println("Alerta: Calor extremo.");
        if (umidade < 30) System.out.println("Alerta: Umidade baixa.");
        if (temp >= 35 && umidade < 20) System.out.println("Alerta: Risco de queimada.");
        sc.close();
    }
}