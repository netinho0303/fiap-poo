package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;
import br.com.fiapride.model.Tampa;

public class TesteGarrafa {

    public static void main(String[] args) {

        //Criamos a tampa primeiro
        Tampa br.com.fiapride.model.Tampa minhaTampa = new Tampa("Preta", "Plástico");

        //Criamos a garrafa associando a tampa
        Garrafa minhaGarrafa = new Garrafa("Azul", "Inox", minhaTampa);

         //o material da tampa através da garrafa
        System.out.println("Garrafa cor: " + minhaGarrafa.getCor());
        System.out.println("Material da tampa: " + minhaGarrafa.getTampa().getMaterial());

    }
}