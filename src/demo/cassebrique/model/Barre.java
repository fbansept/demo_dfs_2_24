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
}
