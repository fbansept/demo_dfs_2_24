package demo.cassebrique.model;

import java.awt.*;
import demo.cassebrique.*;

public class Barre extends Rectangle {

    public Barre() {
        super(  Fenetre.LARGEUR / 2 - 100,
                Fenetre.HAUTEUR - 100,
                200, 40,
                Color.GREEN);
    }

    public void deplacementGauche() {
        x -= 10;
        if(x < 0) {
            x = 0;
        }
    }

    public void deplacementDroite() {
        x += 10;
        if(x > Fenetre.LARGEUR - largeur) {
            x = Fenetre.LARGEUR - largeur;
        }

    }
}
