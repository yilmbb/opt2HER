import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private WerknemerBeheer werknemerBeheer;
    private Registreren registreren;
    private Informatie informatie;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.werknemerBeheer = new WerknemerBeheer();
        this.registreren = new Registreren(werknemerBeheer);
        this.informatie = new Informatie(werknemerBeheer);
    }

    public void hoofdMenu() {
        System.out.println("===================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1) Werknemer registreren\n");
        System.out.print("2) Werknemer gegevens inzien\n");
        System.out.print("9) Afsluiten\n");

        while (true) {
            int keuze = scanner.nextInt();

            System.out.println("===================================================");

            switch (keuze) {
                case 1:
                    registreren.voegNieuweWerknemerToe();
                    hoofdMenu();
                    return;
                case 2:
                    if (werknemerBeheer.getAantalWerknemers() != 0) {
                        informatie.toonAlleNamen();
                        System.out.println("Kies werknemer");
                        int werknemerKeuze = scanner.nextInt();
                        informatie.toonWerknemerInfo(werknemerKeuze - 1);
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
