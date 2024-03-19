package demo.test;

public class Salarie implements Mensualisable{

    int salaireAnnuel;

    public Salarie(int salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    @Override
    public int calculCoutMensuel() {
        return salaireAnnuel / 12;
    }
}
