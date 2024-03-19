package demo.test;

public class Etudiant extends Personne{

    private int noteGlobale;

    public Etudiant(String nom,  int noteGlobale) {
        super(nom, "inconnu");
        this.noteGlobale = noteGlobale;
    }

    @Override
    public String getFullName() {
        return "Etd. " + super.getFullName();
    }

    public int getNoteGlobale() {
        return noteGlobale;
    }

    public void setNoteGlobale(int noteGlobale) {
        this.noteGlobale = noteGlobale;
    }
}
