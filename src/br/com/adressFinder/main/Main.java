import br.com.adressFinder.api.cepApi;
import br.com.adressFinder.model.Adress;
import br.com.adressFinder.service.fileGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        cepApi consultaCep = new cepApi();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();

        try {
            Adress novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            fileGenerator gerador = new fileGenerator();
            gerador.saveJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}