public class WerknemerLogger implements Observer {
    public WerknemerLogger(Observable o) {
        o.add(this);
    }

    @Override
    public void update(int aantalWerknemers) {
        System.out.println();
        System.out.println("Er is een werknemer toegevoegd");
        System.out.println("Het nieuwe aantal werknemers is: " + aantalWerknemers);
        System.out.println();
    }
}
