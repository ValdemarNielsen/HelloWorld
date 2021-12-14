package Lektion4;

import java.util.Scanner;
import java.lang.*;

public class Trekant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast sidelængden a: ");
        System.out.println("Indtast sidelængden b: ");
        System.out.println("Indtast sidelængden c: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Noget er galt!");

        } else if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("Trekanten er ligesidet");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Trekanten er ligebenet");

        } else if ((side1 * side1) + (side2 * side2) == (side3 * side3) ||
                (side2 * side2) + (side3 * side3) == (side1 * side1) || (side1 * side1) + (side3 * side3) == (side2 * side2)) {
            System.out.println("Trekanten er retvinklet");

            /* Spidse vinkel og stump-vinkel modstrider hinanden. Derfor fejl.


        } else if (side1 != side2 && side2 != side3 && side3 != side1) {
            System.out.println("Trekanten er spids");
        } else {
            System.out.println("trekanten er stump");
        } */

        }
    }
}