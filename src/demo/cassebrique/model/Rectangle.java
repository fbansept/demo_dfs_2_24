package demo.cassebrique.model;

import java.awt.*;

public abstract class Rectangle extends Forme {

    protected int largeur;
    protected int hauteur;

    public Rectangle(
            int x,
            int y,
            int largeur,
            int hauteur,
            Color couleur) {
        super(x, y, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(x,y,largeur,hauteur);
    }
}
