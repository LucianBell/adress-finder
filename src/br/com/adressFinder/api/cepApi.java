package br.com.adressFinder.api;

import br.com.adressFinder.model.Adress;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class cepApi {

    public void searchCep(Adress adress) {
        String cep = adress.getCEP();
        String apiEndpoint = "https://viacep.com.br/ws/" + cep + "/json";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiEndpoint))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String json = response.body();
        } catch (Error | IOException | InterruptedException error) {
            System.out.println("Error: " + error);
        }
    }
}
