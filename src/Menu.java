import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private WerknemerBeheer werknemerBeheer;
    private Registratie registratie;
    private InfoPrinter infoPrinter;
    private NamenPrinter namenPrinter;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.werknemerBeheer = new WerknemerBeheer();
        this.registratie = new Registratie(werknemerBeheer);
        this.infoPrinter = new InfoPrinter();
        this.namenPrinter = new NamenPrinter(werknemerBeheer);
        //Dit subscribed een nieuwe werknemerlogger aan de instantie van werknemerbeheer
        WerknemerLogger l = new WerknemerLogger(werknemerBeheer);
    }

    public void hoofdMenu() {
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
                    hoofdMenu();
                    return;
                case 2:
                    if (werknemerBeheer.getAantalWerknemers() != 0) {
                        namenPrinter.toonAlleNamen();
                        System.out.println("Kies werknemer");
                        int werknemerKeuze = scanner.nextInt();
                        infoPrinter.toonWerknemerInfo(werknemerBeheer.getWerknemer(werknemerKeuze - 1));

                    } else {
                        System.out.println("Er zijn geen werknemers");
                    }
                    hoofdMenu();
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