
package br.com.fiapride.model;

public class GarrafaTermica extends Garrafa {

    // Atributo exclusivo da classe filha
    private int conservacaoHoras;

    // Construtor da classe filha
    public GarrafaTermica(String cor, String material, Tampa tampa, int conservacaoHoras) {
        // Chama o construtor da classe Garrafa
        super(cor, material, tampa);

        this.conservacaoHoras = conservacaoHoras;
    }

    public int getConservacaoHoras() {
        return this.conservacaoHoras;
    }

	public void encherGarrafa(int i) {
		// TODO Auto-generated method stub
		
	}
}
