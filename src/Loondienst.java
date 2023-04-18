public class Loondienst extends Werknemer{

    private double btw;

    public Loondienst(String naam, double uurloon, int uren) {
        super(naam, uurloon, uren);
        this.btw = 0.21;
    }

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
