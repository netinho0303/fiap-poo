package br.com.fiapride.model;

public class Garrafa {

    private String cor;
    private String material;
    private int quantidadeEmML;

    // A Garrafa tem uma Tampa
    private Tampa tampa;

    // Construtor
    public Garrafa(String cor, String material, Tampa tampa) {
        this.cor = cor;
        this.material = material;
        this.tampa = tampa;
        this.quantidadeEmML = 0;
    }

    // Getter para acessar a Tampa
    public Tampa getTampa() {
        return this.tampa;
    }

	public void pintar(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCor() {
		// TODO Auto-generated method stub
		return null;
	}

    
}