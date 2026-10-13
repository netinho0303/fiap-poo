package br.com.fiapride.model;

public class Garrafa {

    // Capacidade máxima da garrafa (regra de negócio)
    private static final int CAPACIDADE_MAXIMA_ML = 3000;

    // ATRIBUTOS: todos privados
    private String cor;
    private int quantidadeEmML;
    private String material;

    // CONSTRUTOR: toda garrafa nasce com cor e material, e vazia
    public Garrafa(String cor, String material) {
        this.setCor(cor);
        this.setMaterial(material);
        this.setQuantidadeEmML(0);
    }

    // ========== COMPORTAMENTOS (regras de negócio) ==========

    public void beberAgua(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: informe uma quantidade maior que zero para beber.");
        } else if (quantidade > this.quantidadeEmML) {
            System.out.println("Erro: a garrafa só tem " + this.quantidadeEmML
                    + "ml, não dá para beber " + quantidade + "ml!");
        } else {
            this.setQuantidadeEmML(this.quantidadeEmML - quantidade);
            System.out.println("Você bebeu " + quantidade + "ml. Restam " + this.quantidadeEmML + "ml.");
        }
    }

    public void encherGarrafa(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: informe uma quantidade maior que zero para encher.");
        } else if (this.quantidadeEmML + quantidade > CAPACIDADE_MAXIMA_ML) {
            System.out.println("Erro: a garrafa transbordaria! Capacidade máxima: "
                    + CAPACIDADE_MAXIMA_ML + "ml.");
        } else {
            this.setQuantidadeEmML(this.quantidadeEmML + quantidade);
            System.out.println("Garrafa enchida com " + quantidade + "ml. Total: " + this.quantidadeEmML + "ml.");
        }
    }

    // ========== GETTERS E SETTERS ==========

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeEmML() {
        return this.quantidadeEmML;
    }

    // REGRA ESPECIAL: não aceita valores menores que 0 nem maiores que 3000 ml
    public void setQuantidadeEmML(int quantidade) {
        if (quantidade >= 0 && quantidade <= CAPACIDADE_MAXIMA_ML) {
            this.quantidadeEmML = quantidade;
        } else {
            System.out.println("Erro de Segurança: quantidade inválida (" + quantidade
                    + "ml). Deve estar entre 0 e " + CAPACIDADE_MAXIMA_ML + "ml.");
        }
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}