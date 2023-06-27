public class WerknemerNamenPrinter {
    private WerknemerDatabase werknemerDatabase;

    public WerknemerNamenPrinter(WerknemerDatabase werknemerDatabase) {
        this.werknemerDatabase = werknemerDatabase;
    }

    public void toonAlleNamen() {
        for (int i = 0; i < werknemerDatabase.getAantalWerknemers(); i++) {
            int index = i + 1;
            System.out.println(index + ". " + werknemerDatabase.getWerknemer(i).getNaam());
        }
        System.out.println("===================================================");
    }
}