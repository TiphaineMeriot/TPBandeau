package effet;

import bandeau.Bandeau;

public class EffetAffichageProgressif extends Effet {

    //Affiche les lettres une par une
    @Override
    public void appliquer(Bandeau bandeau) {
        String texte = bandeau.getMessage();
        bandeau.setMessage("Progressif");
        for (int i = 0; i < getRepetition(); i++) {
            for (int j = 0; j < texte.length(); j++) {
                bandeau.setMessage(texte.substring(0, j + 1));
                bandeau.sleep(300);
            }

            if (i < getRepetition() - 1) {
                bandeau.sleep(500);
            }
        }
    }
}