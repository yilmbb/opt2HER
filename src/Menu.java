import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public static void hoofdMenu() {
        System.out.println("===================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1) Werknemer registreren\n");
        System.out.print("2) Werknemer gegevens inzien\n");
        System.out.print("9) Afsluiten\n");


        while (true) {
            int keuze = scanner.nextInt();

            System.out.println("===================================================");

            // Switch statement om de selectie van de gebruiker te bepalen
            switch (keuze) {
                case 1:
                    Registreren.voegNieuweWerknemerToe();
                    hoofdMenu();
                    return;
                case 2:
                    if (Werknemer.werknemers.size() != 0) {
                        Informatie.toonAlleNamen();
                        System.out.println("Kies werknemer");
                        int werknemerKeuze = scanner.nextInt();

                        Werknemer werknemer = Werknemer.werknemers.get(werknemerKeuze - 1);
                        Informatie.toonWerknemerInfo(werknemer);

                    } else {
                        System.out.println("Er zijn geen werknemers");
                    }
                    hoofdMenu();
                    return;
                case 3:
                    return;
                case 9:
                    System.out.println("Programma wordt afgesloten...");
                    return;
                default:
                    // Als de gebruiker geen geldige optie heeft geselecteerd, geef een foutmelding en toon het menu opnieuw
                    System.out.println("Ongeldige keuze. Maak een keuze uit de volgende opties:");
                    System.out.print("1) Informatie invullen.\n");
                    System.out.print("2) Werknemerinfo inzien. \n");
                    System.out.print("9) Afsluiten\n");
                    System.out.print("Optie: ");
            }
        }
    }
}

