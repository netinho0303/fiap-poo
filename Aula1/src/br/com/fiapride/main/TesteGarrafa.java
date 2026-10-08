package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class TesteGarrafa {

    public static void main(String[] args) {

        System.out.println("--- Teste do Meu Projeto Pessoal: Garrafa ---\n");

        // 1. Instanciando com o construtor
        Garrafa minhaGarrafa = new Garrafa("Azul", "Aço inoxidável");

        // 2. Lendo os dados com os Getters
        System.out.println("Cor: " + minhaGarrafa.getCor());
        System.out.println("Material: " + minhaGarrafa.getMaterial());
        System.out.println("Quantidade: " + minhaGarrafa.getQuantidadeEmML() + "ml");

        // 3. Testando comportamentos
        System.out.println("\n--- Enchendo e bebendo ---");
        minhaGarrafa.encherGarrafa(500);
        minhaGarrafa.beberAgua(200);

        // 4. Tentando BURLAR o sistema 
        System.out.println("\n--- Tentando burlar as regras ---");
        minhaGarrafa.beberAgua(1000);          
        minhaGarrafa.encherGarrafa(5000);     
        minhaGarrafa.setQuantidadeEmML(-50);   
        minhaGarrafa.setQuantidadeEmML(9999);  
        
        
        
        
        System.out.println("\n--- Estado final ---");
        System.out.println("Quantidade: " + minhaGarrafa.getQuantidadeEmML() + "ml");
    }
}