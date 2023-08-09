package br.com.adressFinder.main;

import br.com.adressFinder.model.Adress;
import br.com.adressFinder.api.cepApi;

import br.com.adressFinder.service.fileGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        String entrada = " ";
        String nome = " ";

        while (!entrada.equalsIgnoreCase("sair")) {
            try {
                System.out.println("***********************************");
                System.out.println("Olá, seja bem-vindo ao AdressFinder");
                System.out.println("Para começar, me diga, qual seu nome?");
                nome = leitura.nextLine();

                System.out.println("Perfeito, " + nome + "! Agora, qual é seu CEP?");
                entrada = leitura.nextLine();

                Adress cep = new Adress();
                cep.setCEP(entrada);

                cepApi cepAPI = new cepApi();
                cepAPI.searchCep(cep);
                cep.setDatails(cepAPI.searchCep(cep));

                fileGenerator generator = new fileGenerator();
                generator.saveJSON(cep);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando aplicação");
            }
        }
    }
}