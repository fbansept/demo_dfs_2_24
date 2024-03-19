package demo.cassebrique.model;

import java.awt.*;
import demo.cassebrique.*;

public class Balle {

    protected int x;
    protected int vitesseHorizontal;
    protected int y;
    protected int vitesseVertical;
    protected int diametre = 25;
    protected Color couleur = Color.RED;

    public Balle() {
        this.x = (int)(Math.random() * Fenetre.LARGEUR);
        this.y = (int)(Math.random() * Fenetre.HAUTEUR);
        this.vitesseHorizontal = (int)(Math.random() * 5) + 1;
        this.vitesseVertical = (int)(Math.random() * 5) + 1;
        this.couleur = new Color(
                (float)(Math.random()),
                (float)(Math.random()),
                (float)(Math.random()));
    }

    public Balle(int x, int y, int vitesseHorizontal,  int vitesseVertical) {
        this.x = x;
        this.vitesseHorizontal = vitesseHorizontal;
        this.y = y;
        this.vitesseVertical = vitesseVertical;
    }

    public void deplacement() {
        x += vitesseHorizontal;
        y += vitesseVertical;

        if(x >= Fenetre.LARGEUR - diametre || x <= 0) {
            vitesseHorizontal = - vitesseHorizontal;
        }

        if(y >= Fenetre.HAUTEUR - diametre || y <= 0) {
            vitesseVertical = -vitesseVertical;
        }
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillOval(x,y,diametre,diametre);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }
}
