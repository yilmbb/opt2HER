import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private WerknemerDatabase werknemerDatabase;
    private Registratie registratie;
    private InfoPrinter infoPrinter;
    private WerknemerNamenPrinter werknemerNamenPrinter;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.werknemerDatabase = new WerknemerDatabase();
        this.registratie = new Registratie(werknemerDatabase);
        this.infoPrinter = new InfoPrinter();
        this.werknemerNamenPrinter = new WerknemerNamenPrinter(werknemerDatabase);
        //Dit subscribed een nieuwe werknemerlogger aan de instantie van werknemerbeheer
        WerknemerLogger aantalWerknemers = new WerknemerLogger(werknemerDatabase);
    }

    public void toonHoofdMenu() {
        System.out.println("===================================================");
        System.out.print("1) Werknemer registreren\n");
        System.out.print("2) Werknemer gegevens inzien\n");
        System.out.print("9) Afsluiten\n");

        while (true) {
            int keuze = scanner.nextInt();

            System.out.println("===================================================");

            switch (keuze) {
                case 1:
                    registratie.voegNieuweWerknemerToe();
                    toonHoofdMenu();
                    return;
                case 2:
                    if (werknemerDatabase.getAantalWerknemers() != 0) {
                        werknemerNamenPrinter.toonAlleNamen();
                        System.out.println("Kies werknemer");
                        int werknemerKeuze = scanner.nextInt();
                        infoPrinter.toonWerknemerInfo(werknemerDatabase.getWerknemer(werknemerKeuze - 1));

                    } else {
                        System.out.println("Er zijn geen werknemers");
                    }
                    toonHoofdMenu();
                    return;
                case 9:
                    System.out.println("Programma wordt afgesloten...");
                    return;
                default:
                    System.out.println("Ongeldige keuze. Maak een keuze uit de volgende opties:");
                    System.out.print("1) Informatie invullen.\n");
                    System.out.print("2) Werknemerinfo inzien. \n");
                    System.out.print("9) Afsluiten\n");
                    System.out.print("Optie: ");
            }
        }
    }
}