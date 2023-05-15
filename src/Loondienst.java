public class Loondienst extends Werknemer{

    private double btw;

    public Loondienst(String naam, double uurloon, int uren, boolean diploma, int werkervaring) {
        super(naam, uurloon, uren, diploma, werkervaring);
        this.btw = 0.21;


    }
    @Override
    public double maandSalaris(){
        return (super.maandSalaris() * this.btw) + super.maandSalaris();
    }

    public double getSalarisExBtw(){
        return super.maandSalaris();
    }

    public double getBtwVerrekend(){
        return this.btw * super.maandSalaris();
    }

}
