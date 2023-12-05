package scenario;

import bandeau.Bandeau;
import effet.*;

import java.awt.*;
import java.util.ArrayList;

public class Scenario {

    // Liste d'effets
    private ArrayList<Effet> listeEffets;

    // Constructeur
    public Scenario() {
        this.listeEffets = new ArrayList<>();
    }

    //Ajoute un effet avec le nombre de répétition
    public void ajouterEffet(Effet effet, int repetition) {
        effet.setRepetition(repetition);
        listeEffets.add(effet);
    }

    //Joue le scénario sur un bandeau
    public void jouerScenario(Bandeau bandeau) {
        for (Effet effet : listeEffets) {
            effet.appliquer(bandeau);
        }
    }

    // Méthode principale
    public static void main(String[] args) {

        Scenario s = new Scenario();
        s.ajouterEffet(new EffetCouleurFond(), 10);
        s.ajouterEffet(new EffetZoom(2.2), 2);
        s.ajouterEffet(new EffetAffichageProgressif(),1);
        s.ajouterEffet(new EffetRotation(), 3);
        Bandeau monBandeau = new Bandeau();
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        s.jouerScenario(monBandeau);
    }
}
