package br.com.fiapride.model;

public class GarrafaTermica extends Garrafa {

    private int conservacaoHoras;

    public GarrafaTermica(String cor, String material, Tampa tampa, int conservacaoHoras) {
        super();
        this.conservacaoHoras = conservacaoHoras;
    }

  // Avisa o Java que você está reescrevendo o método da mãe
    public String conservarLiquido() {
        return "Conservando líquido quente/frio por " + this.conservacaoHoras + " horas isolado a vácuo.";
    }
}