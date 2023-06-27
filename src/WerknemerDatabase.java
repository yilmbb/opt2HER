import java.util.ArrayList;

public class WerknemerDatabase implements Observable {
    private ArrayList<Werknemer> werknemers;
    private ArrayList<Observer> observers = new ArrayList<>();

    public WerknemerDatabase() {
        werknemers = new ArrayList<>();
    }

    public void voegWerknemerToe(Werknemer werknemer) {
        werknemers.add(werknemer);
        notifyObservers();
    }

    // -> voor elke observer in de lijst de update() functie aanroept
    @Override
    public void notifyObservers(){
        for (Observer o : observers){
            o.update(werknemers.size());
        }
    }
    //schrijf een functie die een observer toevoegt aan de lijst
    public void add(Observer o){
    observers.add(o);
    }

    public Werknemer getWerknemer(int index) {
        return werknemers.get(index);
    }

    public int getAantalWerknemers() {
        return werknemers.size();
    }
}