import java.util.Scanner;

public class Registratie {
    private WerknemerBeheer werknemerBeheer;
    private Scanner scanner;

    public Registratie(WerknemerBeheer werknemerBeheer) {
        this.werknemerBeheer = werknemerBeheer;
        this.scanner = new Scanner(System.in);
    }

    public void voegNieuweWerknemerToe() {
        System.out.print("Voer naam in: ");
        String naam = getInputString();

        double uurloon = getInputDouble("Voer uurloon in: ");
        int uren = getInputInteger("Voer uren in: ");
        boolean diploma = getInputBoolean("Heeft diploma? (ja/nee): ");
        int werkervaring = getInputInteger("Voer werkervaring in: ");
        boolean beroepsCompetentiebewijs = getInputBoolean("Voer beroepsCompetentiebewijs in (ja/nee): ");

        int type = getInputInteger("Wat voor type werknemer? (1 = Zzper, 2 = Loondienst): ");
        Werknemer werknemer = createWerknemer(type, naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);

        if (werknemer != null) {
            werknemerBeheer.voegWerknemerToe(werknemer);
        }
    }

    private Werknemer createWerknemer(int type, String naam, double uurloon, int uren, boolean diploma, int werkervaring, boolean beroepsCompetentiebewijs) {
        if (type == 1) {
            return new Zzper(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
        } else if (type == 2) {
            return new Loondienst(naam, uurloon, uren, diploma, werkervaring, beroepsCompetentiebewijs);
        } else {
            System.out.println("Ongeldig type werknemer. Probeer opnieuw.");
            return null;
        }
    }

    private String getInputString() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                break;
            } else {
                System.out.print("Ongeldige invoer. Voer opnieuw in: ");
            }
        }
        return input;
    }

    private double getInputDouble(String prompt) {
        double input;
        while (true) {
            System.out.print(prompt);
            try {
                input = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ongeldige invoer. Voer een geldig numeriek bedrag in.");
            }
        }
        return input;
    }

    private int getInputInteger(String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ongeldige invoer. Voer een geldig geheel getal in.");
            }
        }
        return input;
    }

    private boolean getInputBoolean(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("ja")) {
                return true;
            } else if (input.equalsIgnoreCase("nee")) {
                return false;
            } else {
                System.out.println("Ongeldige invoer. Voer 'ja' of 'nee' in.");
            }
        }
    }
}
