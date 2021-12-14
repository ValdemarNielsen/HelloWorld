package Lektion6;

public class Badevandstemperatur {
    public static void main(String[] args) {

        int[] badetemp = new int[args.length];
        for (int i = 0; i < badetemp.length; i++) {

            badetemp[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));

    }

    public static int maks(int[] badetemp) {
        int max = 0;
        if (badetemp.length == 0) {
            return 0;
        }

        for (int i = 0; i < badetemp.length; i++) {
            if (badetemp[i] > max) {
                max = badetemp[i];
            }
        }
        return max;
    }

    public static int antalfald(int[] badetemp) {
        int antalfald = 0;
        for (int i = 0; i < badetemp.length - 1; i++) {
            if (badetemp[i] > badetemp[i + 1]) {
                antalfald++;
            }
        }
        return antalfald;
    }
}
