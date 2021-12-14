package Lektion3;

import java.util.Locale;
import java.util.Scanner;

public class Dyrelyde {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = 0;

        while (t < 10) {
            System.out.println("name an animal");
            String dyre = input.nextLine();
            String dyr=dyre.toLowerCase();
            switch (dyr) {
                case "dog":
                    System.out.println("Woof");
                    break;
                case "cat":
                    System.out.println("Meow");
                    break;
                case "fish":
                    System.out.println("Blob");
                    break;
                case "cow":
                    System.out.println("Muh");
                    break;
                case "lion":
                    System.out.println("Roar");
                    break;
                case "sheep":
                    System.out.println("Bah");
                    break;
                case "duck":
                    System.out.println("Quack");
                    break;
                default:
                    System.out.println("Wrong animal. Try another");
                    break;


            }
        }
    }
}
