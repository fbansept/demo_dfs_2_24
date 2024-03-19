package demo.cassebrique;

import demo.cassebrique.model.Balle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fenetre extends Canvas {

    public static final int LARGEUR = 500;
    public static final int HAUTEUR = 600;

    protected JFrame fenetre = new JFrame();

    public Fenetre() {

        Container panneau = fenetre.getContentPane();
        panneau.add(this);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(LARGEUR, HAUTEUR);
        setSize(LARGEUR, HAUTEUR);
        setBounds(0, 0, LARGEUR, HAUTEUR);

        setFocusable(false);
        fenetre.requestFocus();
        fenetre.setResizable(false);
        fenetre.pack();
        fenetre.setIgnoreRepaint(true);

        fenetre.setVisible(true);
        createBufferStrategy(2);

        ArrayList<Balle> tableauBalle = new ArrayList<>();

        for(int i = 0; i <1000 ; i++) {
            tableauBalle.add(new Balle());
        }

        while (true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();

            dessin.setColor(Color.WHITE);
            dessin.fillRect(0, 0, LARGEUR, HAUTEUR);

            for(Balle balle : tableauBalle) {
                balle.deplacement();
                balle.dessiner(dessin);
            }

            dessin.dispose();
            getBufferStrategy().show();

            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        new Fenetre();
    }

}
