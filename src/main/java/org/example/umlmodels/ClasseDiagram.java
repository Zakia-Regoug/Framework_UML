package org.example.umlmodels;

import java.util.List;

public class ClasseDiagram {
    private List<Entite> entites;
    private List<Relation> relations;

    public ClasseDiagram(List<Entite> entites, List<Relation> relations) {
        this.entites = entites;
        this.relations = relations;
    }

    public ClasseDiagram() {
    }

    public List<Entite> getEntites() {
        return entites;
    }

    public void setEntites(List<Entite> entites) {
        this.entites = entites;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }
}
