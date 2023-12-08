package org.example.umlmodels;

import org.example.umlmodels.enums.TypeMethode;
import org.example.umlmodels.enums.Visibilite;

import java.util.List;

public class Methode {
    private String nom;
    private String typeRetour;
    private List<Parametre> parametres;
    private TypeMethode type;
    private Visibilite visibilite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeRetour() {
        return typeRetour;
    }

    public void setTypeRetour(String typeRetour) {
        this.typeRetour = typeRetour;
    }

    public List<Parametre> getParametres() {
        return parametres;
    }

    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }

    public TypeMethode getType() {
        return type;
    }

    public void setType(TypeMethode type) {
        this.type = type;
    }

    public Visibilite getVisibilite() {
        return visibilite;
    }

    public void setVisibilite(Visibilite visibilite) {
        this.visibilite = visibilite;
    }
}
