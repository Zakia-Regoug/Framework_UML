package org.example.umlmodels;

import org.example.umlmodels.enums.typeClasse;

import java.util.List;

public class Classe extends Entite{
    private List<Attribut> attributs;
    private List<Methode> methodes;
    private List<Constructeur> constructeurs;
    private typeClasse type;
}
