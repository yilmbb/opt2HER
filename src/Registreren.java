import java.util.Scanner;

public class Registreren {
    private WerknemerBeheer werknemerBeheer;
    static Scanner scanner = new Scanner(System.in);

    public Registreren(WerknemerBeheer werknemerBeheer) {
        this.werknemerBeheer = werknemerBeheer;
    }

    public void voegNieuweWerknemerToe() {
        Werknemer werknemer;

        System.out.print("Voer naam in: ");
        String naam = scanner.nextLine();

        System.out.print("Voer uurloon in: ");
        double uurloon = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Voer uren in: ");
        int uren = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Heeft diploma? (ja/nee): ");
        boolean diploma = scanner.nextLine().toLowerCase().equals("ja");

        System.out.print("Voer werkervaring in: ");
        int werkervaring = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Voer beroepsCompetentiebewijs in (ja/nee): ");
        boolean beroepsCompetentiebewijs = scanner.nextLine().toLowerCase().equals("ja");

        System.out.print("Wat voor type werknemer? (1 = Zzper, 2 = Loondienst): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            werknemer = new Zzper(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
            werknemerBeheer.voegWerknemerToe(werknemer);
        } else if (type == 2) {
            werknemer = new Loondienst(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
            werknemerBeheer.voegWerknemerToe(werknemer);
        } else {
            System.out.println("Ongeldig type werknemer. Probeer opnieuw.");
        }
    }
}
