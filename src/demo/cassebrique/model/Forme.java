package demo.cassebrique.model;

import java.awt.*;

public abstract class Forme {

    protected int x;
    protected int y;
    protected Color couleur;

    public Forme(int x, int y, Color couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
    }

    abstract public void dessiner(Graphics2D dessin);
}
