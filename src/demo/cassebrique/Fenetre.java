package demo.cassebrique;

import demo.cassebrique.model.Balle;
import demo.cassebrique.model.Barre;
import demo.cassebrique.model.Brique;
import demo.cassebrique.model.Forme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Fenetre extends Canvas implements KeyListener {

    public static final int LARGEUR = 500;
    public static final int HAUTEUR = 600;

    protected JFrame fenetre = new JFrame();

    ArrayList<Balle> tableauBalle = new ArrayList<>();
    ArrayList<Forme> tableauForme = new ArrayList<>();
    Barre barre = new Barre();

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

        fenetre.addKeyListener(this);

        fenetre.setVisible(true);
        createBufferStrategy(2);

        Balle ballePrincipale = new Balle(LARGEUR / 2, HAUTEUR / 2 , -3 , -3);

        tableauBalle.add(ballePrincipale);
        tableauForme.add(ballePrincipale);

        for(int indexLigne = 0; indexLigne < 4; indexLigne ++) {
            for(int indexColonne = 0; indexColonne < 10; indexColonne ++) {
                tableauForme.add(new Brique(indexColonne * 50 + 5, indexLigne * 35 + 5));
            }
        }

        tableauForme.add(barre);

        while (true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();

            dessin.setColor(Color.WHITE);
            dessin.fillRect(0, 0, LARGEUR, HAUTEUR);

            for(Balle balle : tableauBalle) {
                balle.deplacement();
            }

            for(Forme forme : tableauForme) {
                forme.dessiner(dessin);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            barre.deplacementGauche();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            barre.deplacementDroite();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
