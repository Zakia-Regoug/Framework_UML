package org.example.umlmodels;

import org.example.umlmodels.enums.typeAssociation;

import java.util.List;

public class Association extends Relation {
    private typeAssociation type;
    private Classe entiteSource;
    private Entite entiteDestination;
    private List<Enumerateur> cardinalite;
}
