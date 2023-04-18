public class Werknemer {

    private String naam;
    private double uurloon;
    private int uren;

    public Werknemer(String naam, double uurloon, int uren) {
        this.naam = naam;
        this.uurloon = uurloon;
        this.uren = uren;
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
        return uren * uurloon;
    }

    public String getTypeWerknemer() {
       return getClass().getName();
    }

}
