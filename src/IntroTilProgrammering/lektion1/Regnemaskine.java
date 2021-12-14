package IntroTilProgrammering.lektion1;

import java.util.*;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("skriv dit regnestykke med mellemrum mellem tal og tegn");
        double num1 = input.nextDouble();
        char tegn = input.next().charAt(0);
        double num2 = input.nextDouble();

        // Beregning hvis dividere /
        if (tegn == '/') {
            double dividere = (num1 / num2);
            System.out.println(dividere);
        }
        // beregning hvis subtraktion -
        if (tegn == '-') {
            double subtraktion = (num1 - num2);
            System.out.println(subtraktion);

        }
        // beregning hvis addition +
        if (tegn == '+') {
            double addition = (num1 + num2);
            System.out.println(addition);
        }
        // beregning hvis gange *
        if (tegn == '*') {
            double gange = (num1 * num2);
            System.out.println(gange);
        }

        // beregning hvis %

    }
}
