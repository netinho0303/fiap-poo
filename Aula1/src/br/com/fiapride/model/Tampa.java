package br.com.fiapride.model;

public class Tampa {

    private String cor;
    private String material;

    public Tampa(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMaterial() {
        return this.material;
    }
}