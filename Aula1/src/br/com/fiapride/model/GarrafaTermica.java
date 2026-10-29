package br.com.fiapride.model;

public class GarrafaTermica extends Garrafa {

    private int conservacaoHoras;

    public GarrafaTermica(String cor, String material, Tampa tampa, int conservacaoHoras) {
        super(cor, material, tampa);
        this.conservacaoHoras = conservacaoHoras;
    }

    // IMPLEMENTAÇÃO DO MÉTODO ABSTRATO
    @Override
    public void exibirTipo() {
        System.out.println("Sou uma Garrafa Térmica com isolamento a vácuo para " + this.conservacaoHoras + " horas.");
    }

	@Override
	public void pintar(String string) {
		// TODO Auto-generated method stub
		
	}
}