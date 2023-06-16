import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Informatie {
    private WerknemerBeheer werknemerBeheer;

    public Informatie(WerknemerBeheer werknemerBeheer) {
        this.werknemerBeheer = werknemerBeheer;
    }


    public void toonWerknemerInfo(int index) {
        Werknemer werknemer = werknemerBeheer.getWerknemer(index);



        System.out.println("\n========= " + werknemer.getTypeWerknemer() + " overzicht =========");

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy 'om' HH:mm 'uur'");
        String strDate = dateFormat.format(date);

        System.out.printf("Datum overzicht: %s\n", strDate);
        System.out.printf("Naam: %s\n", werknemer.getNaam());
        System.out.printf("Aantal gewerkte uren: %s\n", werknemer.getUren());
        System.out.printf("Uurloon: €%,.2f\n", werknemer.getUurloon());

        if (werknemer.getDiploma()) {
            System.out.println("Diploma: Ja");
            System.out.println("Uurloon verhoogd voor het hebben van een diploma.");
        } else {
            System.out.println("Diploma: Nee");
        }

        System.out.printf("Werkervaring: %d jaar\n", werknemer.getWerkervaring());

        if (werknemer.getWerkervaring() >= 10) {
            System.out.println("Uurloon verhoogd voor meer dan 10 jaar werkervaring.");
        } else if (werknemer.getWerkervaring() >= 5) {
            System.out.println("Uurloon verhoogd voor meer dan 5 jaar werkervaring.");
        }

        if (werknemer.getBeroepsCompetentiebewijs()) {
            System.out.println("Beroepscompetentiebewijs: Ja");
            System.out.println("Uurloon verhoogd voor het hebben van een beroepscompetentiebewijs.");
        } else {
            System.out.println("Beroepscompetentiebewijs: Nee");
        }

        if (werknemer.getAlleBonussen()) {
            System.out.println("Extra bonus voor het voldoen aan alle drie de voorwaarden: 20 euro");
        }

        if (werknemer.getTypeWerknemer().equals("Loondienst")) {
            Loondienst loondienst = (Loondienst) werknemer;
            System.out.printf("BTW (21%%): €%,.2f \n", loondienst.getBtwVerrekend());
            System.out.printf("Salaris (incl. 21%% BTW): €%,.2f\n", loondienst.maandSalaris());
        }

        if (werknemer.getTypeWerknemer().equals("Zzper")) {
            Zzper zzper = (Zzper) werknemer;
            System.out.printf("Salaris (ex. 21%% BTW): €%,.2f\n", zzper.maandSalaris());
        }
    }

    public void toonAlleNamen() {
        for (int i = 0; i < werknemerBeheer.getAantalWerknemers(); i++) {
            int index = i + 1;
            System.out.println(index + ". " + werknemerBeheer.getWerknemer(i).getNaam());
        }
        System.out.println("===================================================");
    }
}
