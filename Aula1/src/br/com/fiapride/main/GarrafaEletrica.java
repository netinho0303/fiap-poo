package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;
import br.com.fiapride.model.Tampa;

public class GarrafaEletrica extends Garrafa {

    private int voltagem;

    public GarrafaEletrica(String cor, String material, Tampa tampa, int voltagem) {
        super(cor, material, tampa);
        this.voltagem = voltagem;
    }

    // IMPLEMENTAÇÃO OBRIGATÓRIA DO MÉTODO ABSTRATO
    @Override
    public void exibirTipo() {
        System.out.println("Sou uma Garrafa Elétrica aquecida conectada em " + this.voltagem + "V.");
    }

	@Override
	public void pintar(String string) {
		// TODO Auto-generated method stub
		
	}
}