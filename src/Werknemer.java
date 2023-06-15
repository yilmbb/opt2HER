import java.util.ArrayList;

public class Werknemer {
    static ArrayList<Werknemer> werknemers = new ArrayList<>();
    private String naam;
    private double uurloon;
    private int uren;
    private boolean diploma;
    private int werkervaring;
    private boolean beroepsCompetentiebewijs;

    public Werknemer(String naam, double uurloon, int uren, boolean diploma, int werkervaring, boolean beroepsCompetentiebewijs) {
        this.naam = naam;
        this.uurloon = uurloon;
        this.uren = uren;
        this.diploma = diploma;
        this.werkervaring = werkervaring;
        this.beroepsCompetentiebewijs = beroepsCompetentiebewijs;
        this.verhoogUurloon();
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

    public boolean getDiploma() {
        return diploma;
    }

    public int getWerkervaring() {
        return werkervaring;
    }

    public boolean getBeroepsCompetentiebewijs() {
        return beroepsCompetentiebewijs;
    }

    public double maandSalaris() {
        double salaris = uren * uurloon;
        if (getAlleBonussen()) {
            salaris += 20.0;
        }
        return salaris;
    }

    public String getTypeWerknemer() {
        return getClass().getName();
    }

    public boolean getAlleBonussen() {
        return diploma && werkervaring >= 5 && beroepsCompetentiebewijs;
    }

    private void verhoogUurloon() {
        if (werkervaring >= 5) {
            this.uurloon += 3.0;
        }
        if (diploma) {
            this.uurloon += 2.0;
        }
        if (beroepsCompetentiebewijs) {
            this.uurloon += 1.0;
        }
    }
}