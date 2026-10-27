
package br.com.fiapride.model;

public class GarrafaEletrica extends Garrafa {

    // Atributo exclusivo
    private int voltagem;

    // Construtor da classe filha
    public GarrafaEletrica(String cor, String material, Tampa tampa, int voltagem) {
        super(cor, material, tampa);

        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return this.voltagem;
    }

	public void encherGarrafa(int i) {
		// TODO Auto-generated method stub
		
	}
}
