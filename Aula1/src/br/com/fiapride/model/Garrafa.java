package br.com.fiapride.model;


public abstract class Garrafa {

    private String cor;
    private String material;
    private int quantidadeEmML;
    private Tampa tampa; 
    

    // O Construtor continua existindo 
    public Garrafa(String cor, String material, Tampa tampa) {
        this.cor = cor;
        this.material = material;
        this.tampa = tampa;
        this.quantidadeEmML = 0;
    }

    // 2. MÉTODO ABSTRATO (Sem corpo, OBRIGA as filhas concretas a implementarem)
    public abstract void exibirTipo();

    
    public String getCor() {
        return this.cor;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getQuantidadeEmML() {
        return this.quantidadeEmML;
    }

    public Tampa getTampa() {
        return this.tampa;
    }

	public abstract void pintar(String string);
}