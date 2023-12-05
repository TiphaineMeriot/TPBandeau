package effet;

import bandeau.Bandeau;

import java.awt.*;
import java.util.Random;

public class EffetCouleurFond extends Effet {

    // Change la couleur de fond aléatoirement
    @Override
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < getRepetition(); i++) {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            bandeau.setMessage("Couleur");
            bandeau.setBackground(randomColor);
            bandeau.sleep(500);
        }
    }
}
