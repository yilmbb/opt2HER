public class Loondienst extends Werknemer{
    private static final double BTW = 0.21;

    public Loondienst(String naam, double uurloon, int uren, boolean diploma, int werkervaring, boolean beroepsCompetentiebewijs, boolean nederlandse) {
        super(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs, nederlandse);
    }

    @Override
    void printType() {
        System.out.println("Type: Loondienst");
    }

    @Override
    void printFinancien() {
            System.out.printf("BTW (21%%): €%,.2f \n", getBtwVerrekend());
            System.out.printf("Salaris (incl. 21%% BTW): €%,.2f\n", maandSalaris());
    }


    @Override
    public double maandSalaris() {
        return (super.maandSalaris() * BTW) + super.maandSalaris();
    }

    public double getBtwVerrekend() {
        return BTW * super.maandSalaris();
    }
}