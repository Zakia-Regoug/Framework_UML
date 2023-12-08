package org.example.umlmodels;

import org.example.umlmodels.enums.TypeMethode;

import java.util.List;

public class Interface extends Entite{
    private List<Methode> methodes;

    public Interface(List<Methode> methodes) {
        this.name="Interface";
        this.methodes = methodes;
        for(Methode methode:this.methodes){
            methode.setType(TypeMethode.Abstraite);
        }
    }
}
