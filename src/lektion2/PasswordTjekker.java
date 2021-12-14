package lektion2;

import java.util.Scanner;

public class PasswordTjekker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scanner password og måler antal tegn

        System.out.println("giv mig lige dit password");

        boolean dinkode = false;
        while (!dinkode) {
            String password = input.nextLine();
            int length = password.length();

            // anmoder og password

            // hvis password er for kort.
            if (length <= 4) {
                System.out.println("dit password er for kort. Prøv igen");
                dinkode = false;
            }
            // hvis password er for langt
            if (length > 9) {
                System.out.println("dit password er for langt. Prøv igen");
                dinkode = false;
            }
            if (length < 10 && length > 4) {
                System.out.println("dit password er nu " + password);
                dinkode = true;
            }
        }

    }
}

