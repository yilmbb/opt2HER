public class NamenPrinter {
    private WerknemerBeheer werknemerBeheer;

    public NamenPrinter(WerknemerBeheer werknemerBeheer) {
        this.werknemerBeheer = werknemerBeheer;
    }

    public void toonAlleNamen() {
        for (int i = 0; i < werknemerBeheer.getAantalWerknemers(); i++) {
            int index = i + 1;
            System.out.println(index + ". " + werknemerBeheer.getWerknemer(i).getNaam());
        }
        System.out.println("===================================================");
    }
}