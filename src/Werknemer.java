import java.util.ArrayList;

public class Werknemer {
    static ArrayList<Werknemer> werknemers = new ArrayList<>();
    private String naam;
    private double uurloon;
    private int uren;
    private boolean diploma;
    private int werkervaring;

    public Werknemer(String naam, double uurloon, int uren, boolean diploma, int werkevaring) {
        this.naam = naam;
        this.uurloon = uurloon;
        this.uren = uren;
        this.diploma = diploma;
        this.werkervaring = werkevaring;
    }

    public String getNaam() {
        return naam;
    }

    public double getUurloon() {
        return uurloon;
    }

    public int getUren() {
        return uren;
    }

    public double maandSalaris() {
        double salaris = uren * uurloon;

        if (diploma && werkervaring > 5) {
            salaris += 200.0;
        }

        return salaris;
    }

    public String getTypeWerknemer() {
       return getClass().getName();
    }

    public void setUren(){
        if (werkervaring >= 5.0) {
            this.uurloon += 5.0;
        }

        if (diploma) {
            this.uurloon += 5.0;
        }
    }

    public boolean getDiploma(){
        return diploma;
    }

    public int getWerkervaring(){
        return werkervaring;
    }

}
