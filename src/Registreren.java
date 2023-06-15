import java.util.Scanner;

public class Registreren {

    public static void voegNieuweWerknemerToe() {

        Werknemer werknemer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies het type werknemer: ");
        System.out.println("1) Zzper");
        System.out.println("2) Loondienst");
        System.out.print("Keuze: ");

        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Voer de voor- en achtneraam in: ");
        String naam = scanner.nextLine();

        System.out.print("voer de uurloon in: ");
        double uurloon = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Voer het gewerkte aantal uren in: ");
        int uren = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Voer het aantal jaar werkervaring in: ");
        int werkervaring = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Diploma ja/nee: ");
        String diplomaKeuze = scanner.nextLine();
        boolean diploma = diplomaKeuze.equals("ja");

        System.out.print("Heeft de werknemer een beroepscompetentiebewijs? (ja/nee): ");
        String beroepsCompetentiebewijsKeuze = scanner.nextLine();
        boolean beroepsCompetentiebewijs = beroepsCompetentiebewijsKeuze.equals("ja");

        if (type == 1 || type == 2) {
            if (type == 1) {
                werknemer = new Zzper(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
                System.out.println("Werknemer " + werknemer.getNaam() + " Geregistreerd.");
                Werknemer.werknemers.add(werknemer);
            }

            if (type == 2) {
                werknemer = new Loondienst(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
                System.out.println("Werknemer " + werknemer.getNaam() + " Geregistreerd.");
                Werknemer.werknemers.add(werknemer);
            }
        } else {
            System.out.println("Dit type bestaat niet, graag opnieuw invoeren.");
            voegNieuweWerknemerToe();
        }
    }
}