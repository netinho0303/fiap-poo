package br.com.fiapride.main; // ajuste para o pacote do seu projeto pessoal

import br.com.fiapride.model.Garrafa;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // TESTE 1: A forma correta (Nascimento legalizado)
        Garrafa minhaGarrafa = new Garrafa("Azul", "Vidro", null);

        System.out.println("Cor: " + minhaGarrafa.getCor());
        System.out.println("Material: " + minhaGarrafa.getMaterial());

        // TESTE 2: Ação pública que passa pela validação
        minhaGarrafa.pintar("Verde");
        minhaGarrafa.pintar("   ");

       
    }
}