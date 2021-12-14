package IntroTilProgrammering.lektion1;

import java.util.Scanner;

public class SekunderTilDage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Angiv det specifikke antal sekunder du vil have konverteret");
        int sekunder = input.nextInt();

        int dag = sekunder / 86400;
        int time = ((sekunder % 86400) / 3600);
        int minut = sekunder % 3600 / 60;
        int sekund = sekunder % 60;
        System.out.println(dag + "dag(e)" + time + "time(r)" + minut + "minut(er) og " + sekund + "sekund(er)");

    }
}
