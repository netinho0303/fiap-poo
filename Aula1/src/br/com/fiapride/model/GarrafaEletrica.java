package br.com.fiapride.model;

public class GarrafaEletrica extends Garrafa {

    private int voltagem;

    public GarrafaEletrica(String cor, String material, Tampa tampa, int voltagem) {
        super();
        this.voltagem = voltagem;
    }

    @Override
    public String conservarLiquido() {
        return "Aquecendo ou resfriando ativamente o líquido ligado na tensão " + this.voltagem + "V.";
    }
}