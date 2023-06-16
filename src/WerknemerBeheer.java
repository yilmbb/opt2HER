import java.util.ArrayList;

public class WerknemerBeheer {
    private ArrayList<Werknemer> werknemers;

    public WerknemerBeheer() {
        werknemers = new ArrayList<>();
    }

    public void voegWerknemerToe(Werknemer werknemer) {
        werknemers.add(werknemer);
    }

    public Werknemer getWerknemer(int index) {
        return werknemers.get(index);
    }

    public int getAantalWerknemers() {
        return werknemers.size();
    }
}