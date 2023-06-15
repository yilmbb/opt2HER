public class Loondienst extends Werknemer{
    private static final double BTW = 0.21;

    public Loondienst(String naam, double uurloon, int uren, boolean diploma, int werkervaring, boolean beroepsCompetentiebewijs) {
        super(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
    }

    @Override
    public double maandSalaris() {
        return (super.maandSalaris() * BTW) + super.maandSalaris();
    }

    public double getBtwVerrekend() {
        return BTW * super.maandSalaris();
    }
}