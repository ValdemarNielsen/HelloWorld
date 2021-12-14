package IntroTilProgrammering.lektion1;

import java.util.Scanner;

public class AfstandMellemLinjer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // får vores a, b, x0 oog y0 værdier.
        System.out.println("indtast a og b fra din lining");
        double aværdi = input.nextDouble();
        double bværdi = input.nextDouble();
        System.out.println("indtast nu din x0 og y0");
        double x0værdi = input.nextDouble();
        double y0værdi = input.nextDouble();

        // Beregn afstanden mellem punkt og linje
        double afstand = (aværdi * x0værdi - y0værdi + bværdi) / (Math.sqrt(1 + aværdi * aværdi));
        System.out.println("afstanden mellem linje og punkt er " + afstand);
    }
}
