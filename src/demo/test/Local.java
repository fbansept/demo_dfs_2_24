package demo.test;

public class Local implements Mensualisable {

    int surface;
    int prixMensuelMetreCarre;

    public Local(int surface, int prixMensuelMetreCarre) {
        this.surface = surface;
        this.prixMensuelMetreCarre = prixMensuelMetreCarre;
    }

    @Override
    public int calculCoutMensuel() {
        return surface * prixMensuelMetreCarre;
    }
}
