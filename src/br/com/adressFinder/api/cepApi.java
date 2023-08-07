package br.com.adressFinder.api;

import br.com.adressFinder.model.Adress;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class cepApi {

    public static void main(String[] args) {
        Adress data = new Adress();

        String adress = "https://viacep.com.br/ws/" + data.getCEP() + "/json";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(adress))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Error | IOException | InterruptedException error) {
            System.out.println("Error: " + error);
        }
    }
}
