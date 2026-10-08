package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class Sistemaprincipal {

    public static void main(String[] args) {
    	
        // Instanciando a garrafa
        Garrafa minhaGarrafa = new Garrafa(null, null);
        minhaGarrafa.setCor("Azul");
        minhaGarrafa.setMaterial("Plástico");
        minhaGarrafa.setQuantidadeEmML(0); // Começa vazia

        System.out.println("=== TESTANDO A GARRAFA ===");

        // Executando operações válidas
        minhaGarrafa.encherGarrafa(500);
        minhaGarrafa.beberAgua(200);

        // Executando operações inválidas para testar as regras de negócio
        minhaGarrafa.beberAgua(400); // Erro: quantidade insuficiente
        minhaGarrafa.encherGarrafa(-50); // Erro: valor inválido
    }
}