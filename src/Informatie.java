import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Informatie {

    public static void toonWerknemerInfo(Werknemer werknemer) {

        System.out.println("\n========= "+ werknemer.getTypeWerknemer() +" overzicht =========");

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy 'om' HH:mm 'uur'");
        String strDate = dateFormat.format(date);

        System.out.printf("Datum overzicht: %s\n", strDate);
        System.out.printf("Naam: %s\n", werknemer.getNaam());
        System.out.printf("Aantal gewerkte uren: %s\n", werknemer.getUren());
        System.out.printf("Uurloon (ex. 21%% BTW): €%,.2f\n", werknemer.getUurloon());

        if (werknemer.getTypeWerknemer().equals("Loondienst")) {
            Loondienst loondienst = (Loondienst) werknemer;
            System.out.printf("BTW (21%%): €%,.2f \n", loondienst.getBtwVerrekend());
            System.out.printf("Salaris (incl. 21%% BTW): €%,.2f\n", loondienst.getSalarisExBtw());
        }

        if (werknemer.getTypeWerknemer().equals("Zzper")) {
            Zzper zzper = (Zzper) werknemer;
            System.out.printf("Salaris (ex. 21%% BTW): €%,.2f\n", zzper.maandSalaris());
        }

        if (werknemer.getDiploma() && werknemer.getWerkervaring() > 5) {
            System.out.println("Bonus: 200 euro");

        }

    }


    public static void toonAlleNamen() {
            for (int i = 0; i < Werknemer.werknemers.size(); i++) {
                int index = i + 1;
                System.out.println(index + ". " + Werknemer.werknemers.get(i).getNaam());
            }
        System.out.println("===================================================");
    }

}

