package effet;

import bandeau.Bandeau;

import java.awt.*;

public abstract class Effet {

    private int repetition; // Nombre de répétition

    private Bandeau b; // Bandeau

    // Constructeur
    public Effet() {
        this.b=b;
        this.repetition=1;
    }

    // Méthode abstraite pour appliquer l'effet au bandeau
    public abstract void appliquer(Bandeau bandeau);

    //Modifie le nombre de répétition
    public void setRepetition(int r) {
        this.repetition = r;
    }

    //Récupère le nombre de répétition
    public int getRepetition() {
        return repetition;
    }
}
