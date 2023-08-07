package br.com.adressFinder.model;

public class Adress {

        private String CEP;
        private String logradouro;
        private String bairro;
        private String localidade;
        private String uf;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
