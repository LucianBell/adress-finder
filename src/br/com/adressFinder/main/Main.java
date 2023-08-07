package br.com.adressFinder.main;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String entrada = " ";
        String nome = " ";

        while (!entrada.equalsIgnoreCase("sair")) {
            System.out.println("***********************************");
            System.out.println("Olá, seja bem-vindo ao AdressFinder");
            System.out.println("Para começar, me diga, qual seu nome?");
            nome = leitura.nextLine();
            System.out.println("Perfeito, " + nome + "! Agora, qual é seu CEP?");
            entrada = leitura.nextLine();
        }
    }
}