package effet;

import bandeau.Bandeau;

import java.awt.*;

public class EffetZoom extends Effet{

    private double zoomFactor; //Facteur de zoom

    // Constructeur
    public EffetZoom(double zoomFactor) {
        this.zoomFactor = zoomFactor;
    }

    // Méthode pour appliquer l'effet de zoom sur le bandeau avec un nombre de répétitions
    @Override
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < getRepetition(); i++) {
            for (int j = 0; j < 60; j++) {
                bandeau.setMessage("Zoom");
                bandeau.setFont(new Font("Dialog", Font.BOLD, (int) (j + zoomFactor)));
                bandeau.sleep(100);
            }
        }
    }
}
