package IntroTilProgrammering.lektion1;

import java.util.Scanner;
class andengradsligningsløser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub¨
        Scanner input = new Scanner(System.in);
        System.out.println("Angiv venligst a, b og c-værdien i den rækkefølge");

        double aværdi = input.nextDouble();
        double bværdi = input.nextDouble();
        double cværdi = input.nextDouble();

        // Beregn diskriminanten
        double diskriminanten = (bværdi*bværdi)-4*aværdi*cværdi;

        System.out.println("diskriminanten er " + diskriminanten);

        // Ingen løsning
        if (diskriminanten<0) {
            System.out.println("Der er ingen løsninger til ligningen");
        }

        // 1 løsning
        else if (diskriminanten == 0) {
            double løsning0 = (-bværdi)/(2*aværdi);
            System.out.println("Der er én løsning. Løsningen er " + løsning0);
        }

        // 2 løsninger.
        else {
            double løsning1 = (-bværdi+Math.sqrt(diskriminanten))/(2*aværdi);
            double løsning2 = (-bværdi-Math.sqrt(diskriminanten))/(2*aværdi);
            System.out.println("Løsningen til ligningen er " + løsning1 +" "+ løsning2);
        }

    }
}