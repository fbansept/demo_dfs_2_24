package demo.test;

public class Personne  {

    protected String nom;
    protected String prenom;
    protected int age;



    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getFullName() {
        return prenom + " " + nom;
    }

    public String getFullName(String civilite) {
        return civilite + ". " + nom + " " + prenom;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
}
