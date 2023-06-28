public class Zzper extends Werknemer{
    public Zzper(String naam, double uurloon, int uren, boolean diploma, int werkervaring, boolean beroepsCompetentiebewijs, boolean nederlandse) {
        super(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs, nederlandse);
    }

    @Override
    void printType() {
        System.out.println("Type: Zzper");
    }

    @Override
    void printFinancien() {
        System.out.printf("Salaris (ex. 21%% BTW): €%,.2f\n", super.maandSalaris());
    }

    //niet nodig want Werknemer.maandsalaris kan ook direct aangeroepen worden op een instantie van Zzper
//    @Override
//    public double maandSalaris() {
//        return super.maandSalaris();
//    }
}