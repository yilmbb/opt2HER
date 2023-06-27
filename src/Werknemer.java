import java.util.ArrayList;

abstract class Werknemer {
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

    private void verhoogUurloon() {
        if (werkervaring >= 10) {
            this.uurloon += 5.0;
        } else if (werkervaring >= 5) {
            this.uurloon += 3.0;
        }
        if (diploma) {
            this.uurloon += 2.0;
        }
        if (beroepsCompetentiebewijs) {
            this.uurloon += 1.0;
        }
    }

    public String checkUurloon(int ervaring) {
        if (10 <= werkervaring) {
            this.uurloon += 5.0;
            return "verhoging van 5 euro";
        } else if (5 <= werkervaring) {
            this.uurloon += 3.0;
            return "verhoging van 3 euro";
        } else {
            return "je krijgt geen verhoging";
        }
    }


    public double maandSalaris() {
        double salaris = uren * uurloon;
        if (getAlleBonussen()) {
            salaris += 20.0;
        }
        return salaris;
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

    public boolean getAlleBonussen() {
        return diploma && werkervaring >= 5 && beroepsCompetentiebewijs;
    }


    public void printInfo() {
        //stap 1
        printType();
        //stap 2
        printFinancien();
    }

    abstract void printType();
    abstract void printFinancien();
}