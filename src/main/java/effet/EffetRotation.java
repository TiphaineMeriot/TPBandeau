package effet;

import bandeau.Bandeau;

public class EffetRotation extends Effet{

    // Fais tourner le mot
    @Override
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < getRepetition(); i++) {
            bandeau.sleep(1000);
            bandeau.setMessage("Tourne");
            bandeau.setRotation(Math.PI / 2.0f);
            bandeau.sleep(1000);
            bandeau.setRotation(Math.PI);
            bandeau.sleep(1000);
            bandeau.setRotation(0.0f);
        }

    }
}
