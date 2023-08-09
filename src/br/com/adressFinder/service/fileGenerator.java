package br.com.adressFinder.service;

import br.com.adressFinder.model.Adress;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class fileGenerator {

    public void saveJSON(Adress adress) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter file = new FileWriter(adress.getCEP() + ".json");
        file.write(gson.toJson(adress));
        file.close();
    }

}
