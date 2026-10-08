package br.com.fiapride.model;

public class Garrafa {

    // Atributos (privados, conforme o diagrama)
    private String cor;
    private int quantidadeEmML;
    private String material;

    // Método: Encher a garrafa
    public void encherGarrafa(int quantidade) {
        // Regra de negócio: A quantidade deve ser positiva
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade para encher deve ser maior que zero.");
            return;
        }
        this.quantidadeEmML += quantidade;
        System.out.println("Garrafa reabastecida com " + quantidade + " ml. Total atual: " + this.quantidadeEmML + " ml.");
    }

    // Método: Beber água da garrafa
    public void beberAgua(int quantidade) {
        // Regra de negócio: A quantidade deve ser positiva
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade consumida deve ser maior que zero.");
            return;
        }
        // Regra de negócio: Não é possível beber mais do que o disponível
        if (this.quantidadeEmML < quantidade) {
            System.out.println("Erro: Quantidade insuficiente de água na garrafa. Conteúdo atual: " + this.quantidadeEmML + " ml.");
            return;
        }
        this.quantidadeEmML -= quantidade;
        System.out.println("Você bebeu " + quantidade + " ml. Restante na garrafa: " + this.quantidadeEmML + " ml.");
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeEmML() {
        return quantidadeEmML;
    }

    public void setQuantidadeEmML(int quantidadeEmML) {
        this.quantidadeEmML = quantidadeEmML;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}